package lefonddeletang.expectoPatternum.schtroumpf;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {



        Marteau marteau         = Marteau.getInstance();




        Schtroumpf bricoleur    = new Schtroumpf("bricoleur");
        Schtroumpf aLunnette    = new Schtroumpf("à lunnette");
        Schtroumpf farceur      = new Schtroumpf("farceur");

        List<Schtroumpf> travailleurs = new ArrayList<Schtroumpf>();

        bricoleur.setOutil(marteau);
        bricoleur.setOutil(marteau);
        farceur.setOutil(marteau);

        travailleurs.add(bricoleur);
        travailleurs.add(aLunnette);
        travailleurs.add(farceur);


        Pont leBarrage = Pont.getInstance(travailleurs);





        Thread t1 = new Thread(bricoleur);
        Thread t3 = new Thread(aLunnette);
        Thread t4 = new Thread(farceur);

        t3.start();
        t1.start();
        t4.start();
    }
}
