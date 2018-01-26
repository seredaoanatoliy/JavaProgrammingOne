
package Chapter7;
import java.util.Scanner;
/**
 * Program to display number averages
 *
 *
 * @author Anatoliy Sereda
 */
public class P7 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers will it read?");
        int numamount = input.nextInt();

        System.out.println("Enter " + numamount + " elements:");

        int arrayone[] = new int[numamount];

       fillArray(arrayone, input);
       averageArray(arrayone, numamount);
       displayArray(arrayone);

    }
    
    public static void fillArray(int [] arrayone, Scanner input) {
         for (int counter = 0; counter <  arrayone.length; counter++) {
            arrayone[counter] = input.nextInt();
            
        }
    }
    
    public static void  displayArray(int [] arrayone) {
        // System.out.println("The contents of the array: " + array.toString(arrayone));
    }


public static void averageArray(int [] arrayone, int numamount) {
        int sum = 0;
         for (int counter = 0; counter < arrayone.length; counter++) {
           sum += arrayone[counter];
         }
                      double average = sum / numamount;
           System.out.println("The average is " + average);
        
    }
}
