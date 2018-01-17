
package Chapter5;
import java.util.Scanner;
/**
 * Program to display which bidder has the better deal to the console 
 * 
 *
 * @author Anatoliy Sereda
 */
public class P5 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
	   //naming stuff
        int no = 0;
        int total = 0;
		int inv = 0;
		int yes = 0;
        
	   //body stuff
     	String a;
        char b = 0;
        while (b != 'Q') {
            System.out.print("Enter \"Y\" to vote yes, \"N\" to vote no, or \"Q\" to stop voting. ");
            a = input.next().toUpperCase();
            b = a.charAt(0);
            if (b == 'Y') 
                yes++;
            if (b == 'N')
                no++;
            if (b != 'Y' && b != 'N' && b != 'Q'){
                System.out.print("Invalid input ");
                inv++;
            }
            total++;
        }
        //text options
		System.out.println("yes votes: "+yes);
        System.out.println("no votes: "+no);
        System.out.println("invalid votes: "+inv);
        System.out.println("total votes: "+(total - 1));
    }
}
