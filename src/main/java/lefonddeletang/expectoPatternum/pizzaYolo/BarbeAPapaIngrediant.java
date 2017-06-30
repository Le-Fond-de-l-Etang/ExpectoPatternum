package lefonddeletang.expectoPatternum.pizzaYolo;

/**
 * Created by hugo on 29/06/2017.
 */
public class BarbeAPapaIngrediant extends PizzaDecorator {

    public BarbeAPapaIngrediant(PizzaAbstact pizzaAgarnir){
        super(pizzaAgarnir,4,3);
        this.ingrediant = "barbe à papa";
    }

}
