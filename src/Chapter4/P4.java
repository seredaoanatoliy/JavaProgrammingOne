
package Chapter4;
import java.util.Scanner;
/**
 * Program to display which bidder has the better deal to the console 
 * 
 *
 * @author Anatoliy Sereda
 */
public class P4 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */ 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
	//Bidder one info
	System.out.println("What is the name of bidder 1");
        String bidderonename = input.next();
	
        System.out.println("How many hours of work does bidder one require");
	int bidderonework = input.nextInt();
	
	System.out.println("How much does bidder one charge per hour");
	double bidderoneprice = input.nextDouble();
	
	double onecost = bidderonework * bidderoneprice;
	
        //Bidder two info
	System.out.println("What is the name of bidder two");
        String biddertwoname = input.next();
	
	System.out.println("How many hours of work does bidder one require");
	int biddertwowork = input.nextInt();
	
	System.out.println("How much does bidder two charge per hour");
	double biddertwoprice = input.nextDouble();
	
	double twocost = biddertwowork * biddertwoprice;
	
	if (onecost < twocost)
	  System.out.printf("The winner is %s and the price is %.2f", bidderonename, onecost);
  
	if (onecost > twocost)
	  System.out.printf("The winner is %s and the price is %.2f", biddertwoname, twocost);
  
	if (onecost == twocost && bidderonework < biddertwowork)
	  System.out.printf("The winner is %s and the price is %.2f with %d number of hours." , bidderonename, onecost, bidderonework);
  
    if (onecost == twocost && bidderonework > biddertwowork)
	  System.out.printf("The winner is %s and the price is %.2f with %d number of hours." , biddertwoname, twocost, biddertwowork);
   
    if (onecost == twocost && bidderonework == biddertwowork)
    {  
        System.out.printf("Both %s and %s have the same bid." , bidderonename, biddertwoname);
  	  System.out.printf("\nThey both had work hours of %s" , bidderonework);
      System.out.printf("\nThe bids per hour were both %.2f" , bidderoneprice);
      System.out.printf("\nThe total costs were both %.2f" , onecost);
    }
    }
}


