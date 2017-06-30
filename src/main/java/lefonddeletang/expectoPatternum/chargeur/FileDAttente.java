package lefonddeletang.expectoPatternum.chargeur;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;



/**
 * File d'attente utilisée pour stocker différents produits entre producteurs et consommateurs
 *
 * @param <Produit> Type du produit
 */
public class FileDAttente<Produit> {
	/** Taille maximum de la file **/
	private int tailleMax;
	/** Liste des produits **/
	private BlockingQueue<Produit> file;
	
	/**
	 * Constructeur de file d'attente
	 * 
	 * @param tailleMax Taille maximum de la file
	 */
	public FileDAttente(int tailleMax) {
		this.tailleMax = tailleMax;
		file = new LinkedBlockingQueue<Produit>(this.tailleMax);
	}
	
	
	
	/**
	 * Renvoie le dernier élément (s'il existe) de la liste
	 *
	 * @return Produit
	 */
	public Produit retrieveFromFile() {
		return file.poll();
	}
	
	/**
	 * Ajoute un produit à la liste si possible
	 * 
	 * @param produit Produit à insérer
	 * @return Booléen validant l'ajout (false si liste pleine)
	 */
	public boolean addToFile(Produit produit) {
		return file.offer(produit);
	}
	
	/** Getter de la taille prise par les objets de la liste **/
	public int getSize() {
		return file.size();
	}
	
	/** Getter de la taille restante disponible dans la liste **/
	public int getRemainingSize() {
		return file.remainingCapacity();
	}
}
