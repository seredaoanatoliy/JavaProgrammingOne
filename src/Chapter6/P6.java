package Chapter6;

import java.util.Scanner;

/**
 * Program to display money conversions
 *
 *
 * @author Anatoliy Sereda
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    private static String reply;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //money values
        System.out.println("How many Euros will a dollar buy?");
        double Euro = input.nextDouble();
        System.out.println("How many Pound Sterling will a dollar buy?");
        double Pound = input.nextDouble();
        System.out.println("How many Yen will a dollar buy?");
        double Yen = input.nextDouble();
        do {
            String moneySwitch = "";

            System.out.println("Enter the number of dollars");
            double Dollar = input.nextDouble();
            System.out.println("Enter \"E\" to buy Euros \"P\" to buy Pounds or \"Y\" to buy Yen");
            moneySwitch = input.next().toUpperCase();

            switch (moneySwitch) {
                case "E":
                    System.out.printf("For %.2f dollars, you will get %.2f euros", Dollar, convert(Dollar, Euro));
                    break;
                case "P":
                    System.out.printf("For %.2f dollars, you will get %.2f pounds", Dollar, convert(Dollar, Pound));
                    break;
                case "Y":
                    System.out.printf("For %.2f dollars, you will get %.2f Yen", Dollar, convert(Dollar, Yen));
                    break;
            }

            do {
                System.out.println("Would you like to continue?(yes/no)");
                reply = input.next().toUpperCase();
            } while (!reply.equals("YES") && !reply.equals("NO"));

        } while (reply.equals("YES"));

    }

    /**
     * Method to return money after conversion
     *
     * @param dollars original money amount
     * @param currency money after conversion
     * @return currency after the conversion
     */
    public static double convert(double dollars, double currency) {
        if (dollars > 100) {
            return (.95 * dollars * currency);
        } else {
            return (.90 * dollars * currency);
        }
    }
}
