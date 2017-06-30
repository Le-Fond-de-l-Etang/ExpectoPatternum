package lefonddeletang.expectoPatternum.schtroumpf;



/**
 * Etat du pont terminé
 */
public class PontTermine implements PontState {

	/**
	 * Fonction de construction, qui va ici désassigner l'objectif du schtroumpf puisque le pont est construit
	 */
    public void construire(Pont pont, Schtroumpf schtroumpf) {
    	schtroumpf.setObjectif(null);
    	schtroumpf.retraiterSchtroumpf();
    }

    public String toString(){
        return "PontTermine";
    }
}
