package lefonddeletang.expectoPatternum.chargeur;

/**
 * Classe d'instanciation de cables
 */
public class CableFactory {
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
