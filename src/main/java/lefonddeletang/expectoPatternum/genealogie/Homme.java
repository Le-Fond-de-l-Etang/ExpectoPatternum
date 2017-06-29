package lefonddeletang.expectoPatternum.genealogie;

import java.util.Optional;

/**
 * Individu masculin
 */
public class Homme extends Personne {
	private Optional<Femme> femme = Optional.empty();
	
	public Homme(String nom) {
		super(nom);
	}
	
	public void setFemme(Femme femme) {
		this.femme = Optional.ofNullable(femme);
	}
	public Optional<Femme> getFemme() {
		return femme;
	}
}
