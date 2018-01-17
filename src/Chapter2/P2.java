
package Chapter2;
import java.util.Scanner;
/**
 * Program to display a total price of a meal to the console 
 * 
 *
 * @author Anatoliy Sereda
 */
public class P2 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */   
    public static void main(String[] args) {
    // Create a Scanner object
	Scanner input = new Scanner(System.in);
	
	//Prompt the usere to enter a meal price
	System.out.print("Enter a number for the price of the meal: ");
    double Meal = input.nextDouble(); 
    
    //Prompt the usere to enter a drink price
	System.out.print("Enter a number for the price of the drink: ");
    double Drink = input.nextDouble(); 
	
	 //Prompt the usere to enter a dessert price
	System.out.print("Enter a number for the price of the dessert: ");
    double Dessert = input.nextDouble(); 
	
	//Compute subtotal without tax and tip
    double Subtotal = Meal + Drink + Dessert;
	
	// Compute tax
    double Tax = 0.1 * Subtotal;
  
    // Compute tip
    double Tip = (Tax + Subtotal) * 0.15;
	
	// Compute total
    double Total = Tip + Tax + Subtotal;
	  
	      // Display results
    System.out.println("The total cost" +
	  " is " + Total);
	  
	  	  // Display results
    System.out.println("The tax cost" +
	  " is " + Tax);
	  	 
		 // Display results
    System.out.println("The tip cost" +
	  " is " + Tip);
	     
		 // Display results
    System.out.println("The food cost" +
	  " is " + Subtotal);
  }
}
