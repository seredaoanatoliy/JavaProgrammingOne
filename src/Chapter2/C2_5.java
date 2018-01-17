package Chapter2;

import java.util.Scanner;

/**
 * Program to display a total and gratuity amount to the console
 *
 *
 * @author Anatoliy Sereda
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the usere to enter a Subtotal
        System.out.print("Enter a number for the subtotal: ");
        double Subtotal = input.nextDouble();

        //Prompt the usere to enter a Gratuity
        System.out.print("Enter a number for the gratuity rate: ");
        double GratuityRate = input.nextDouble();

        // Compute GratuityAmount 
        double GratuityAmount = (GratuityRate / 100) * Subtotal;

        // Compute GratuityAmount 
        double Total = GratuityAmount + Subtotal;

        // Display results
        System.out.println("The gratuity"
                + " is " + GratuityAmount);

        // Display results
        System.out.println("The total"
                + " is " + Total);
    }
}
