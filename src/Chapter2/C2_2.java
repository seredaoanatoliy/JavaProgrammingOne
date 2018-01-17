package Chapter2;

import java.util.Scanner;

/**
 * Program to display the area of a circle and volume of a cylinder to the
 * console
 *
 *
 * @author Anatoliy Sereda
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the usere to enter a length 
        System.out.print("Enter a number for Length: ");
        double Length = input.nextDouble();

        //Prompt the user to enter a radius
        System.out.print("Enter a number for Radius: ");
        double Radius = input.nextDouble();

        // Compute Area
        double Area = Radius * Radius * 3.14;

        // Compute Volume
        double Volume = Area * Length;

        // Display results
        System.out.println("The area for a circle"
                + " is " + Area);

        // Display results
        System.out.println("The volume for a cylinder"
                + " is " + Volume);

    }
}
