package lefonddeletang.expectoPatternum.pizzaYolo;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Created by hugo on 29/06/2017.
 */
public class Margarita  extends PizzaAbstact {


    public Margarita(int prix,int tempsDeCuisson) {
        super(prix, tempsDeCuisson);

    }
    public String toString(){
        return "Pizza Margarita";
    }


}
