package lefonddeletang.expectoPatternum.chargeur;



/**
 * Producteur de transformateur à la chaîne
 */
public class TransformateurProducer implements Runnable {
	/** Booléen attestant que le producteur est en cours de production */
	boolean producing = true;
	/** File d'attente partagée des transformateurs produits */
	private final FileDAttente<Transformateur> transformateurQueue;
	
	/**
	 * Constructeur de producteur de transformateur, initialisant la file d'attente à remplir
	 * 
	 * @param transformateurQueue
	 */
	public TransformateurProducer(final FileDAttente<Transformateur> transformateurQueue) {
		this.transformateurQueue = transformateurQueue;
	}

	/**
	 * Boucle runnable de la chaîne de production
	 */
	public void run() {
		// Production des transformateurs
		while (producing) {
			Transformateur newTransformateur = new Transformateur();
			if (this.transformateurQueue.addToFile(newTransformateur)) {
				System.out.println("Création d'un transformateur par le producteur de transformateur.");
			}
		}
		
		// Epuisement du stock de transformateur
		if (transformateurQueue.getSize() > 0) {
			System.out.println(transformateurQueue.getSize() + " transformateur(s) non utilisé(s) stocké(s).");
		}
	}
	
	/**
	 * Arrêt de la chaîne de production
	 */
	public void stopProducing() {
		this.producing = false;
	}
}
