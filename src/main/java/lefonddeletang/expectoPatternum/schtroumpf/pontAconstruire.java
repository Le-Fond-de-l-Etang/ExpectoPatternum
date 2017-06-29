package lefonddeletang.expectoPatternum.schtroumpf;

import java.util.Iterator;
import java.util.List;

/**
 * Created by hugo on 29/06/2017.
 */
public class PontAConstruire implements PontState {

    public void construire(Pont pont, Schtroumpf sch) {
        sch.setObjectif(pont);
    }
    public String toString(){
        return "PontAConstruire";
    }

}
