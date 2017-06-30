package lefonddeletang.expectoPatternum.chargeur;

import java.util.Optional;



/**
 * Producteur de chargeur
 * 
 * Dépend de la production de transformateur associée
 */
public class ChargeurProducer implements Runnable {
	/** Booléen attestant que le producteur est en cours de production */
	boolean producing = true;
	/** File d'attente partagée des transformateurs à utiliser */
	private final FileDAttente<Transformateur> transformateurQueue;
	/** File d'attente partagée des chargeurs produits */
	private final FileDAttente<Chargeur> chargeurQueue;
	/** Factory servant à créer des cables */
	private final CableFactory cableFactory = new CableFactory();
	/** Producteur de transformateur à notifier en cas d'arrêt (observateur) **/
	private Optional<TransformateurProducer> transformateurProducer;
	
	/**
	 * Constructeur récupérant les files d'attente de produits et le producteur de transformateur
	 * 
	 * @param transformateurQueue
	 * @param chargeurQueue
	 * @param transformateurProducer
	 */
	public ChargeurProducer(final FileDAttente<Transformateur> transformateurQueue, final FileDAttente<Chargeur> chargeurQueue) {
		this.transformateurQueue = transformateurQueue;
		this.chargeurQueue = chargeurQueue;
	}
	
	/**
	 * Lie un producteur de transformateur afin de pouvoir le notifier lors de l'arrêt de la chaîne
	 * 
	 * @param transformateurProducer Producteur à notifier
	 */
	public void linkTransformateurProducer(TransformateurProducer transformateurProducer) {
		this.transformateurProducer = Optional.ofNullable(transformateurProducer);
	}

	/**
	 * Boucle runnable de la chaîne de production
	 */
	public void run() {
		// Production des chargeurs
		while (producing) {
			if (transformateurQueue.getSize() > 0) {
				// Récupération d'un chargeur
				System.out.println("Transformateur recupere par le producteur de chargeur.");
				Transformateur nouveauTransformateur = transformateurQueue.retrieveFromFile();
				if (nouveauTransformateur != null) {
					// Récupération d'un cable
					Cable nouveauCable = cableFactory.creerCable();
					if (nouveauCable.getClass() == CableDefectueux.class) {
						System.out.println("Le chargeur récupéré était deffectueux !\n");
						this.stopProducing();
					} else {
						// Assemblage du chargeur
						Chargeur nouveauChargeur = new Chargeur(nouveauTransformateur, nouveauCable);
						if (chargeurQueue.getRemainingSize() == 0) {
							this.stopProducing();
							System.out.println("Tous les chargeurs ("+chargeurQueue.getSize()+") ont été produits !\n");
						} else {
							chargeurQueue.addToFile(nouveauChargeur);
							System.out.println("Un nouveau chargeur a ete assemble. (" + this.chargeurQueue.getSize() + " en stock)\n");
						}
					}
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("La chaîne de production s'arrête après avoir créé " + this.chargeurQueue.getSize() + " chargeurs.");
	}
	
	/**
	 * Arrêt de la chaîne de production
	 */
	public void stopProducing() {
		this.producing = false;
		if (this.transformateurProducer.isPresent()) {
			this.transformateurProducer.get().stopProducing();
		}
	}
}
