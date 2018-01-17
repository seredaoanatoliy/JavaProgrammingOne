
package Chapter3;
import java.util.Scanner;
/**
 * Program to display a comparison between 2 numbers to the console 
 * 
 *
 * @author Anatoliy Sereda
 */
public class P3 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number");
	double numberone = input.nextDouble();
	
    System.out.println("Enter the second number");
	double numbertwo = input.nextDouble();
	
	if (numberone < numbertwo)
	  System.out.println("The first number is less than the second");
  
	if (numberone > numbertwo)
	  System.out.println("The first number is greater than the second");
	  
	if (numberone == numbertwo)
	  System.out.println("The first number is equal to the second");
	
	if (numberone <= numbertwo)
	  System.out.println("The first number is less than or equal to the second number");
  
	if (numberone != numbertwo)
	  System.out.println("The first number is not equal to the second number");
  
	if (numbertwo == 0)
	  System.out.println("Cannot divide by zero");

        else if ((numberone / numbertwo) < 1)
	  System.out.println("proper fraction");
    else
	  System.out.println("improper fraction");
  
	if (numberone >= 90)
	  System.out.println("A");

	else if (numberone >= 80)
	  System.out.println("B");

	else if (numberone >= 70)
	  System.out.println("C");
  
	else if (numberone >= 60)
	  System.out.println("D");
    else
	  System.out.println("F");
  
	if (0 < numbertwo && numbertwo <= 100)
	  System.out.println("In range");
    else
	  System.out.println("Out of range");
   }
}
