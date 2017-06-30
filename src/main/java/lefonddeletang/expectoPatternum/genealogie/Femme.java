package lefonddeletang.expectoPatternum.genealogie;

import java.util.Optional;

/**
 * Individu féminin
 */
public class Femme extends Personne {
	/** Mari (optionnel) de la femme **/
	private Optional<Homme> mari = Optional.empty();
	
	/**
	 * Constructeur d'objet Femme
	 * 
	 * @param nom
	 */
	public Femme(String nom) {
		super(nom);
	}
	
	/** Setter de mari **/
	public void setMari(Homme mari) {
		this.mari = Optional.ofNullable(mari);
	}
	/** Getter de mari **/
	public Optional<Homme> getHomme() {
		return mari;
	}
}
