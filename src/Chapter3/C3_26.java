package Chapter3;

import java.util.Scanner;

/**
 * Program to display the divisibility of a number to 5 or 6 to the console
 *
 *
 * @author Anatoliy Sereda
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to test if it is divisible by 5 and 6");
        int number = input.nextInt();

        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 and 6? true");
        } else {
            System.out.println("Is " + number + " divisible by 5 and 6? false");
        }

        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 or 6? true");
        } else {
            System.out.println("Is " + number + " divisible by 5 or 6? false");
        }

        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println(number + " divisible by 5 or 6 but not both? true");
        } else {
            System.out.println("Is " + number + " divisible by 5 or 6 but not both? false");
        }
    }
}
