package lefonddeletang.expectoPatternum.pizzaYolo;



/**
 * Decorator ajoutant du piment a la Pizza
 */
public class PimentDecorator extends PizzaDecorator {
	/** Constructeur */
    public PimentDecorator(PizzaAbstact pizzaAGarnir) {
        super(pizzaAGarnir, 9, 8);
        this.nomIngredient= "piment";
    }
}
