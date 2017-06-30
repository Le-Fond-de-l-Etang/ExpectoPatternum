package lefonddeletang.expectoPatternum.schtroumpf;



/**
 * Etat du pont avant le début de la construction
 */
public class PontAConstruire implements PontState {
	
	/**
	 * Fonction de construction, qui va ici fixer l'objectif à un pont
	 */
    public void construire(Pont pont, Schtroumpf sch) {
        sch.setObjectif(pont);
    }
    
    public String toString(){
        return "PontAConstruire";
    }

}
