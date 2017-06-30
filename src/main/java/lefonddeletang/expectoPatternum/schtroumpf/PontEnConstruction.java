package lefonddeletang.expectoPatternum.schtroumpf;

import java.util.List;

/**
 * Created by hugo on 29/06/2017.
 */
public class PontEnConstruction implements PontState {

    public void construire(Pont pont, Schtroumpf sch) {
        pont.schtroumpfer(sch.force);
    }
    public String toString(){
        return "PontEnConstruction";
    }

}
