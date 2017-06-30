package lefonddeletang.expectoPatternum;

import java.util.Scanner;



/**
 * Programme de centralisation des modules d'ExpectoPatternum
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("===   EXPECTOPATTERNUM !   ===");
    	
    	Scanner reader = new Scanner(System.in);
    	boolean continuer = true;
    	while (continuer) {
    		System.out.println("\n\nSélectionnez votre programme :\n - 1: Le pont des schtroumpfs\n - 2: L'arbre généalogique de la famille Barbapapa\n - 3: L'usine de production de chargeurs de téléphone\n - 4: Journée en immersion dans la Pizzeria PizzaYolo\n - 0: Quitter");
    		int choixUtilisateur = reader.nextInt();
    		switch (choixUtilisateur) {
    		case 1:
    			Thread schtroumpfThread = new Thread(new Runnable() {
    				public void run() {
    					lefonddeletang.expectoPatternum.schtroumpf.App.main(new String[]{});
    				}
    			});
    			schtroumpfThread.start();
    			while (schtroumpfThread.isAlive()) {
    				try {
    					Thread.sleep(1000);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    					break;
    				}
    			}
    			break;
    			
    		case 2:
    			Thread genealogieThread = new Thread(new Runnable() {
    				public void run() {
    					lefonddeletang.expectoPatternum.genealogie.App.main(new String[]{});
    				}
    			});
    			genealogieThread.start();
    			while (genealogieThread.isAlive()) {
    				try {
    					Thread.sleep(1000);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    					break;
    				}
    			}
    			break;
    			
    		case 3:
    			Thread chargeurThread = new Thread(new Runnable() {
    				public void run() {
    					lefonddeletang.expectoPatternum.chargeur.App.main(new String[]{});
    				}
    			});
    			chargeurThread.start();
    			while (chargeurThread.isAlive()) {
    				try {
    					Thread.sleep(1000);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    					break;
    				}
    			}
    			break;
    			
    		case 4:
    			Thread pizzaYoloThread = new Thread(new Runnable() {
    				public void run() {
    					lefonddeletang.expectoPatternum.pizzaYolo.App.main(new String[]{});
    				}
    			});
    			pizzaYoloThread.start();
    			while (pizzaYoloThread.isAlive()) {
    				try {
    					Thread.sleep(1000);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    					break;
    				}
    			}
    			break;
    			
    		case 0:
    			continuer = false;
    			break;
    			
			default:
				System.out.println("Choix incorrect.");
				break;
    		}
    	}
    	
    	reader.close();
    	System.out.println("\nMerci d'avoir utilisé les services du fond de l'étang.");
    }
}
