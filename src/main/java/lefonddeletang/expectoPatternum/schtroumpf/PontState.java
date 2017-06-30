package lefonddeletang.expectoPatternum.schtroumpf;

/**
 * Interface d'état du pont
 */
public interface PontState {
	/** Méthode de construction agissant différemment selon l'état du pont **/
    void construire(Pont pont,Schtroumpf sch);
}
