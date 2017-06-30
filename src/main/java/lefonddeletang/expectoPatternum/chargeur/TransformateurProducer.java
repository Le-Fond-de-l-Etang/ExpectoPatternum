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
			try {
				Transformateur t = new Transformateur();
				this.transformateurQueue.put(t);
				System.out.println("Création d'un transformateur par le producteur de transformateur.");
			} catch (final InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// En attente que la file d'attente soit épuisée
		while (transformateurQueue.size() > 0) {
			try {
				Thread.sleep(200);
				System.out.println("Producteur de transformateur en attente d'épuisement.");
			} catch (final InterruptedException e) {
				break;
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
