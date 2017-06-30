package lefonddeletang.expectoPatternum.chargeur;

/**
 * Objet Chargeur assemblé à partir d'un transformateur et d'un câble
 */
public class Chargeur {
	/** Transformateur du chargeur **/
	private Transformateur transformateur;
	/** Cable du chargeur **/
	private Cable cable;
	
	/**
	 * Constructeur du chargeur à partir d'un transformateur et d'un câble
	 * 
	 * @param transformateur
	 * @param cable
	 */
	public Chargeur(Transformateur transformateur, Cable cable) {
		this.transformateur = transformateur;
		this.cable = cable;
	}
	
	/** Getter du transformateur **/
	public Transformateur getTransformateur() {
		return this.transformateur;
	}
	/** Getter du câble **/
	public Cable getCable() {
		return this.cable;
	}
}
