package lefonddeletang.expectoPatternum.genealogie;

import java.util.ArrayList;
import java.util.List;

/**
 * Individu abstrait
 */
public abstract class Personne {
	/** Liste des enfants de la personne **/
	private List<Personne> enfants = new ArrayList<Personne>();
	/** Nom de la personne **/
	private String nom;
	
	public Personne(String nom) {
		this.nom = nom;
	}
	
	
	
	/**
	 * Ajout d'un enfant à une personne
	 * 
	 * @param enfant
	 */
	public void ajouterEnfant(Personne enfant) {
		this.enfants.add(enfant);
	}
	
	/** Getteur Nom **/
	public String getNom() {
		return this.nom;
	}
	/** Getteur Enfants **/
	public List<Personne> getEnfants() {
		return this.enfants;
	}
	
	
	
	/**
	 * Marier un couple homme-femme ensemble
	 * 
	 * Des évolutions futures sont possibles pour un mariage homme-homme, femme-femme, ou autre
	 * 
	 * @param homme Homme à marier
	 * @param femme Femme à marier
	 */
	public static void marierCouple(Homme homme, Femme femme) {
		homme.setFemme(femme);
		femme.setMari(homme);
	}
	
	/**
	 * Création d'un enfant dans un couple homme-femme
	 * 
	 * @param homme Père de l'enfant
	 * @param femme Mère de l'enfant
	 * @param enfant Nouvel enfant
	 */
	public static void ajouterEnfantACouple(Homme homme, Femme femme, Personne enfant) {
		homme.ajouterEnfant(enfant);
		femme.ajouterEnfant(enfant);
	}
}
