package lefonddeletang.expectoPatternum.pizzaYolo;

/**
 * Created by hugo on 29/06/2017.
 */
public class ChocolatIngrediant extends PizzaDecorator {
    public ChocolatIngrediant(PizzaAbstact pizzaAGarnir) {
        super(pizzaAGarnir, 2, 6);
        this.ingrediant = "chocolat";
    }
}
