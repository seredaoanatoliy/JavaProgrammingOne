
package Chapter6;
import java.util.Scanner;
/**
 * Program to display which bidder has the better deal to the console 
 * 
 *
 * @author Anatoliy Sereda
 */
public class C6_18 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */ 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

		System.out.println("Enter a password");
		String s = input.nextLine();
	
		if (passwordcorrectness(s)) {
			System.out.println("Valid");
		}
		else{
			System.out.println("Invalid");
		}
	}
	/**
         * Method to check if the string is correct
         * @param password the amount of characters
         * @return whether it is false or true
         */
	public static boolean passwordcorrectness(String password) {
	
		if(password.length() < 8)
			return false;
		
		for(int i = 0; i< password.length(); i++) {
			if(!Character.isLetterOrDigit(password.charAt(i))) { //#jav
				return false;
			}
		}
			
			int counter = 0;
		for(int i = 0; i< password.length(); i++) {
			if(Character.isDigit(password.charAt(i))) { //#jav
				++counter;
			}
		}
		return counter >= 2;
	}

}
