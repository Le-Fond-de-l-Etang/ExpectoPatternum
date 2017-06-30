package lefonddeletang.expectoPatternum.schtroumpf;



/**
 * Etat du pont en cours de construction
 */
public class PontEnConstruction implements PontState {

	/**
	 * Fonction de construction, qui va ici schtroumpfer le pont objectif avec la force du schtroumpf fourni en paramètre
	 */
    public void construire(Pont pont, Schtroumpf schtroumpf) {
        pont.schtroumpfer(schtroumpf.force);
    }
    
    public String toString(){
        return "PontEnConstruction";
    }

}
