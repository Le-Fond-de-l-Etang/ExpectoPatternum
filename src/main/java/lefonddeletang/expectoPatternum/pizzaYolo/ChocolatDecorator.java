package lefonddeletang.expectoPatternum.pizzaYolo;



/**
 * Decorator ajoutant du chocolat a la Pizza
 */
public class ChocolatDecorator extends PizzaDecorator {
	/** Constructeur **/
    public ChocolatDecorator(PizzaAbstact pizzaAGarnir) {
        super(pizzaAGarnir, 2, 6);
        this.nomIngredient = "chocolat";
    }
}
