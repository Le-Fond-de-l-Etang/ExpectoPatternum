package lefonddeletang.expectoPatternum.pizzaYolo;

/**
 * Programme de cuisson de pizza dans une pizzeria
 */
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "===   Bienvenue dans la pizzeria PizzaYolo   ===\n" );

        // Instantiation du pizzaiolo et du four
        Pizzaiolo freddy = new Pizzaiolo();
        Four four = Four.getInstance();

        
        
        /// Phase de création des pizzas
        
        // Margarita
        PizzaAbstact pizzaMagarita = new Margarita(7,20);

        // Pizza aux anchois
        PizzaAbstact pizzaFromFuturama = new AngryNorwegianAnchoviesDecorator(pizzaMagarita);
        pizzaFromFuturama.addObserver(freddy);

        // Pizza au piment et au chocolat
        PizzaAbstact pizzaPimentChocolatFromTMHT = new PimentDecorator(new ChocolatDecorator(pizzaMagarita));
        pizzaPimentChocolatFromTMHT.addObserver(freddy);

        // Pizza au popcorn
        PizzaAbstact pizzaPopCornFromTMHT = new PopCornDecorator(pizzaMagarita);
        pizzaPopCornFromTMHT.addObserver(freddy);

        // Pizza à la barbe à papa
        PizzaAbstact pizzaDeBarbamaman = new BarbeAPapaDecorator(pizzaMagarita);
        pizzaDeBarbamaman.addObserver(freddy);
        
        // Pizza terriblement mauvaise
        PizzaAbstact pizzaTasteAweful = new SalsepareilleDecorator(new BarbeAPapaDecorator(new AngryNorwegianAnchoviesDecorator( new ChocolatDecorator( new PimentDecorator(pizzaMagarita)))));
    	pizzaTasteAweful.addObserver(freddy);


    	
    	/// Description des pizzas créées
        System.out.println("\n\nDESCRIPTION DES PIZZAS\n" + " ____\n/    \\\n  u  u|      _______\n    \\ |  .-''#%&#&%#``-.\n   = /  ((%&#&#&%&VK&%&))\n    |    `-._#%&##&%_.-'\n /\\/\\`--.   `-.\"\".-'\n |  |    \\   /`./\n |\\/|  \\  `-'  /\n || |   \\     /\n");
        decrirePizza(pizzaFromFuturama);
        decrirePizza(pizzaPimentChocolatFromTMHT);
        decrirePizza(pizzaPopCornFromTMHT);
        decrirePizza(pizzaDeBarbamaman);
        decrirePizza(pizzaTasteAweful);

        /// Phase de cuisson des pizzas
        System.out.println("\n\nPHASE DE CUISSON\n" + "    ~~~  \n  |||\n /===\\\n|=/_\\=|\n|#####|\n");
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

    /**
     * Décrit les caractéristiques d'une pizza
     * 
     * @param pizza Pizza à décrire
     */
    private static void decrirePizza(PizzaAbstact pizza) {
        System.out.println("NOUVELLE PIZZA : " + pizza.toString() +" :");
        System.out.println(" Prix : " + pizza.getPrix());
        System.out.println(" Temps de cuisson : " + pizza.getTempsDeCuisson() + '\n');
    }

}
