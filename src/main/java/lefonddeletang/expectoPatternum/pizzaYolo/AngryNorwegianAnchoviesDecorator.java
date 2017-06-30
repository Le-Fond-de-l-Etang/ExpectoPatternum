package lefonddeletang.expectoPatternum.pizzaYolo;



/**
 * Decorator ajoutant des anchoix de Futurama a la Pizza
 */
public class AngryNorwegianAnchoviesDecorator extends PizzaDecorator {
	/** Constructeur **/
    public AngryNorwegianAnchoviesDecorator(PizzaAbstact pizzaAGarnir){
        super(pizzaAGarnir,5,2);
        this.nomIngredient ="Angry Norwegian Anchovies";
    }
}
