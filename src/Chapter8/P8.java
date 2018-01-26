package Chapter8;

import java.util.Scanner;

/**
 * Program to display number averages
 *
 *
 * @author Anatoliy Sereda
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;
        int a = 0;
        double[][] sale = new double[4][5];
        String salesid, week, reply;
        do {
            do {
                System.out.println("Enter the salesmans ID as either A B C D ");
                salesid = input.next().toUpperCase();
                //This is if he trypes anything other than abcd
            } while (!salesid.equals("A") && !salesid.equals("B") && !salesid.equals("C") && !salesid.equals("D"));

            switch (salesid) {
                case "A":
                    x = 0;
                    break;
                case "B":
                    x = 1;
                    break;
                case "C":
                    x = 2;
                    break;
                case "D":
                    x = 3;
                    break;
            }
            do {

                //Day of the week
                System.out.println("Enter the day of the week as the letters M, T, W, H, or F: ");
                week = input.next().toUpperCase();
            } while (!week.equals("M") && !week.equals("T") && !week.equals("W") && !week.equals("H")
                    && !week.equals("F"));
            switch (week) {
                case "M":
                    a = 0;
                    break;
                case "T":
                    a = 1;
                    break;
                case "W":
                    a = 2;
                    break;
                case "H":
                    a = 3;
                    break;
                case "F":
                    a = 4;

                    break;
            }
            //Sale amount
            System.out.println("Enter the sale amount number ");
            sale[x][a] += input.nextDouble();

            do {
                System.out.println("Do you have more data? Enter a Y to continue or N to quit: ");
                reply = input.next().toUpperCase();
            } while (!reply.equals("Y") && !reply.equals("N"));
        } while (!reply.equals("N"));
        for (int w = 0; w < sale.length; w++) {
            System.out.print("Salesman " + w);
            for (int y = 0; y < sale[w].length; y++) {
                System.out.print("\t" + sale[w][y]);
            }
            System.out.println();
        }
    }
}
