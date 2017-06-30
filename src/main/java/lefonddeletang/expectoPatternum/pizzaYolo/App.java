package lefonddeletang.expectoPatternum.pizzaYolo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Pizzailo freddy = new Pizzailo();
        Four four = Four.getInstance();

        PizzaAbstact pizzaMagarita = new Margarita(7,20);
        //#######  pizza 1 #########

        System.out.println(pizzaMagarita + " : "+ pizzaMagarita.getPrix());

        PizzaAbstact pizzaFromFuturama = new AngryNorwegianAnchoviesIngrediant(pizzaMagarita);

        pizzaFromFuturama.addObserver(freddy);

        //####### pizza 2 ########

        PizzaAbstact pizzaPimentChocolatFromTMHT = new PimentIngrediant(new ChocolatIngrediant(pizzaMagarita));

        pizzaPimentChocolatFromTMHT.addObserver(freddy);

        //####### pizza 3 ##########
        PizzaAbstact pizzaPopCornFromTMHT = new PopCornIngrediant(pizzaMagarita);

        pizzaPopCornFromTMHT.addObserver(freddy);

        //####### pizza 4 #########

        PizzaAbstact pizzaDeBarbamaman = new BarbeAPapaIngrediant(pizzaMagarita);

        pizzaDeBarbamaman.addObserver(freddy);
        //######### pizza 5 #########

        PizzaAbstact pizzaTasteAweful = new SalsepareilleIngrediant(new BarbeAPapaIngrediant(new AngryNorwegianAnchoviesIngrediant( new ChocolatIngrediant( new PimentIngrediant(pizzaMagarita)))));

        pizzaTasteAweful.addObserver(freddy);


        afficher(pizzaFromFuturama);
        afficher(pizzaPimentChocolatFromTMHT);
        afficher(pizzaPopCornFromTMHT);
        afficher(pizzaDeBarbamaman);
        afficher(pizzaTasteAweful);

        try {
            four.cuirePizza(pizzaFromFuturama);
            four.cuirePizza(pizzaPimentChocolatFromTMHT);
            four.cuirePizza(pizzaPopCornFromTMHT);
            four.cuirePizza(pizzaDeBarbamaman);
            four.cuirePizza(pizzaTasteAweful);
        } catch (InterruptedException e){
            System.out.println("une Pizza a été oublié dans le four, ella a entierement brulé ainsi que la pizzeria");
        }

    }

    private static void afficher(PizzaAbstact pizza) {
        System.out.println(pizza.toString() +"  prix : " + pizza.getPrix() );
    }

}
