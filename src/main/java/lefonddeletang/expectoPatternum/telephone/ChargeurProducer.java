package lefonddeletang.expectoPatternum.telephone;

import java.util.concurrent.BlockingQueue;

public class ChargeurProducer implements Runnable {
	/** Booléen attestant que le producteur est en cours de production */
	boolean producing = true;
	/** File d'attente partagée des transformateurs à utiliser */
	private final BlockingQueue<Transformateur> transformateurQueue;
	/** File d'attente partagée des chargeurs produits */
	private final BlockingQueue<Chargeur> chargeurQueue;
	/** Factory servant à créer des cables */
	private final CableFactory cableFactory = new CableFactory();
	
	public ChargeurProducer(final BlockingQueue<Transformateur> transformateurQueue, final BlockingQueue<Chargeur> chargeurQueue) {
		this.transformateurQueue = transformateurQueue;
		this.chargeurQueue = chargeurQueue;
	}

	public void run() {
		// Production des chargeurs
		while (producing) {
			if (transformateurQueue.size() > 0) {
				System.out.println("Transformateur recupere par le producteur de chargeur !");
				Transformateur nouveauTransformateur = transformateurQueue.poll();
				Cable nouveauCable = cableFactory.creerCable();
				Chargeur nouveauChargeur = new Chargeur(nouveauTransformateur, nouveauCable);
				try {
					chargeurQueue.put(nouveauChargeur);
					System.out.println("Un nouveau chargeur a ete assemble. (" + this.chargeurQueue.size() + " en stock)\n");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Arrêt de la chaîne de production
	 */
	public void stopProducing() {
		this.producing = false;
	}
}
