package lefonddeletang.expectoPatternum.pizzaYolo;

import java.util.Observable;

/**
 * Created by hugo on 30/06/2017.
 */
public abstract class PizzaDecorator extends PizzaAbstact {


    protected int prixIngrediant ;
    protected int tempsDeCuissonIngrediant;
    protected String ingrediant;


    public PizzaDecorator(PizzaAbstact pizzaAGarnir, int prix, int tempsDeCuisson) {

        this.pizzaAGarnir = pizzaAGarnir;
        this.prixIngrediant = prix;
        this.tempsDeCuissonIngrediant = tempsDeCuisson;
    }

    public int getPrix(){
        return  super.pizzaAGarnir.getPrix() + this.prixIngrediant;
    }
    public int getTempsDeCuisson(){
        return  super.pizzaAGarnir.getTempsDeCuisson()+ this.tempsDeCuissonIngrediant;
    }


    public String toString(){
      return  pizzaAGarnir.toString() + " avec " + ingrediant;
    }
}
