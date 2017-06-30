package lefonddeletang.expectoPatternum.pizzaYolo;

/**
 * Created by hugo on 29/06/2017.
 */
public class AngryNorwegianAnchoviesIngrediant extends PizzaDecorator {
    public AngryNorwegianAnchoviesIngrediant(PizzaAbstact pizzaAGarnir){
        super(pizzaAGarnir,5,2);

        this.ingrediant ="Angry Norwegian Anchovies";
    }

}
