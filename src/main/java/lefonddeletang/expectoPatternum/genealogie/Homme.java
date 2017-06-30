package lefonddeletang.expectoPatternum.genealogie;

import java.util.Optional;

/**
 * Individu masculin
 */
public class Homme extends Personne {
	/** Femme (optionnelle) de l'homme **/
	private Optional<Femme> femme = Optional.empty();

	/**
	 * Constructeur d'objet Homme
	 * 
	 * @param nom
	 */
	public Homme(String nom) {
		super(nom);
	}

	/** Setter de femme **/
	public void setFemme(Femme femme) {
		this.femme = Optional.ofNullable(femme);
	}
	/** Getter de femme **/
	public Optional<Femme> getFemme() {
		return femme;
	}
}
