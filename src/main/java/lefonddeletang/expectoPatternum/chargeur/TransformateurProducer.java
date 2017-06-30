package lefonddeletang.expectoPatternum.chargeur;

import java.util.concurrent.BlockingQueue;



/**
 * Producteur de transformateur à la chaîne
 */
public class TransformateurProducer implements Runnable {
	/** Booléen attestant que le producteur est en cours de production */
	boolean producing = true;
	/** File d'attente partagée des transformateurs produits */
	private final BlockingQueue<Transformateur> transformateurQueue;
	
	/**
	 * Constructeur de producteur de transformateur, initialisant la file d'attente à remplir
	 * 
	 * @param transformateurQueue
	 */
	public TransformateurProducer(final BlockingQueue<Transformateur> transformateurQueue) {
		this.transformateurQueue = transformateurQueue;
	}

	public void run() {
		// Production des transformateurs
		while (producing) {
			Transformateur t = new Transformateur();
			if (this.transformateurQueue.offer(t)) {
				System.out.println("Création d'un transformateur par le producteur de transformateur.");
			}
		}
		
		// Epuisement du stock de transformateur
		while (transformateurQueue.size() > 0) {
			System.out.println(transformateurQueue.size() + " transformateur(s) non utilisé(s) stocké(s).");
			try {
				transformateurQueue.clear();
			} catch (UnsupportedOperationException e) {
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
