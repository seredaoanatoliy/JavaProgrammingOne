package Chapter4;

import java.util.Scanner;

/**
 * Program to display the grade and major of a student to the console
 *
 *
 * @author Anatoliy Sereda
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters, the first for classes and the second for grade");
        String a = input.next().toUpperCase();

        char b = a.charAt(0);
        char c = a.charAt(1);

        if (c != '1' && c != '2' && c != '3' && c != '4') {
            System.out.println("Invalid Input");
            System.exit(0);
        }

        switch (b) {

            case 'M':
                System.out.println("Mathematics");
                break;

            case 'C':
                System.out.println("Computer science");
                break;

            case 'I':
                System.out.println("Information Technology");
                break;

            default:
                System.out.println("Invalid input");
                System.exit(0);
        }

        switch (c) {

            case '1':
                System.out.println("Freshman");
                break;

            case '2':
                System.out.println("Sophomore");
                break;

            case '3':
                System.out.println("Junior");
                break;

            case '4':
                System.out.println("Senior");
                break;
        }
    }
}
