package lefonddeletang.expectoPatternum.pizzaYolo;



/**
 * Decorateur generique de Pizza
 */
public abstract class PizzaDecorator extends PizzaAbstact {
	/** Prix de l'ingredient ajoute **/
    protected int prixIngrediant ;
    /** Temps de cuisson ajoute par l'ingredient **/
    protected int tempsDeCuissonIngredient;
    /** Nom de l'ingredient **/
    protected String nomIngredient;

    /**
     * Constructeur du decorateur initialisant les parametres specifiques a l'ingredient 
     * 
     * @param pizzaAGarnir
     * @param prix
     * @param tempsDeCuisson
     */
    public PizzaDecorator(PizzaAbstact pizzaAGarnir, int prix, int tempsDeCuisson) {

        this.pizzaAGarnir = pizzaAGarnir;
        this.prixIngrediant = prix;
        this.tempsDeCuissonIngredient = tempsDeCuisson;
    }

    /** Getter de prix **/
    public int getPrix(){
        return  super.pizzaAGarnir.getPrix() + this.prixIngrediant;
    }
    /** Getter de temps de cuisson **/
    public int getTempsDeCuisson(){
        return  super.pizzaAGarnir.getTempsDeCuisson()+ this.tempsDeCuissonIngredient;
    }
    /** Conversion en string du nom de la pizza d'origine avec tous ses ingredients **/
    public String toString(){
      return  pizzaAGarnir.toString() + " avec " + nomIngredient;
    }
}
