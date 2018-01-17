package Chapter2;

import java.util.Scanner;

/**
 * Program to display the temperature conversion to the console
 *
 *
 * @author Anatoliy Sereda
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the usere to enter a Celsius
        System.out.print("Enter a number for celsius: ");
        double Celsius = input.nextDouble();

        // Compute Fahrenheit
        double Fahrenheit = (9.0 / 5) * Celsius + 32;

        // Display results
        System.out.println("The temperature for Celsius to Fahrenheit "
                + Celsius + " is " + Fahrenheit);
    }

}
