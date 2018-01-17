
package Chapter3;
import java.util.Scanner;
/**
 * Program to display the comparison in the prices of rice to the console 
 * 
 *
 * @author Anatoliy Sereda
 */
public class C3_33 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */ 
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
    System.out.println("Enter weight and price for package 1, put a space between the weight and the price");
    double riceOne = input.nextDouble(); double riceOnePrice = input.nextDouble();
	
	System.out.println("Enter weight and price for package 2, put a space between the weight and the price");
	double riceTwo = input.nextDouble(); double riceTwoPrice = input.nextDouble();
	
	if ( (riceOne / riceOnePrice) > (riceTwo / riceTwoPrice) )
	  System.out.println("Package one has a better price");

	if ( (riceOne / riceOnePrice) < (riceTwo / riceTwoPrice) )
	  System.out.println("Package two has a better price");
	
    if ( (riceOne / riceOnePrice) == (riceTwo / riceTwoPrice) )
	  System.out.println("Both packages have the same price");
   }
}
