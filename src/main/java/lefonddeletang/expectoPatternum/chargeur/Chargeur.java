package lefonddeletang.expectoPatternum.chargeur;

public class Chargeur {
	private Transformateur transformateur;
	private Cable cable;
	
	public Chargeur(Transformateur transformateur, Cable cable) {
		this.transformateur = transformateur;
		this.cable = cable;
	}
	
	public Transformateur getTransformateur() {
		return this.transformateur;
	}
	public Cable getCable() {
		return this.cable;
	}
}
