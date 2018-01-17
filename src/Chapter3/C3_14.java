package Chapter3;

import java.util.Scanner;

/**
 * Program to display a coin toss to the console
 *
 *
 * @author Anatoliy Sereda
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int coin = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your coin toss number (0 is heads and 1 is tails)");
        int guess = input.nextInt();

        if (guess == coin) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("You guessed incorrectly!");
        }

    }
}
