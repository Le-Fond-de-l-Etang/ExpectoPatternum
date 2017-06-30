package lefonddeletang.expectoPatternum.chargeur;



/**
 * Classe d'instanciation de cables
 */
public class CableFactory {
	
	/**
	 * Création de câble - renvoie aléatoirement un câble défectueux qui stoppe l'usine
	 * 
	 * @return Cable standard ou défectueux
	 */
	public Cable creerCable() {
		int succes = (int)(Math.random()*25);
		Cable cable;
		if (succes > 1) {
			cable = new Cable();
		} else {
			cable = new CableDefectueux();
		}
		return cable;
	}
}
