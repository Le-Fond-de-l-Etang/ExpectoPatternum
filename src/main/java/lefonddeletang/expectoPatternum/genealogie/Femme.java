package lefonddeletang.expectoPatternum.genealogie;

import java.util.Optional;

/**
 * Individu féminin
 */
public class Femme extends Personne {
	private Optional<Homme> mari = Optional.empty();
	
	public Femme(String nom) {
		super(nom);
	}
	
	public void setMari(Homme mari) {
		this.mari = Optional.ofNullable(mari);
	}
	public Optional<Homme> getHomme() {
		return mari;
	}
}
