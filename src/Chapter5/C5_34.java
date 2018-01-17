
package Chapter5;
import java.util.Scanner;
/**
 * Program to display which bidder has the better deal to the console 
 * 
 *
 * @author Anatoliy Sereda
 */
public class C5_34 {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */ 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    
	int computerGuess, playerGuess;
	int compCount = 0, playerCount = 0;
	
	do {
	  System.out.print("Enter 0, 1, or 2");
	  playerGuess = input.nextInt();
	  computerGuess = (int)(Math.random() * 3);
	  //0 scissors 1 rock 2 paper
	  switch(playerGuess){
	     case 0:
	       if(computerGuess == 0)	
		   System.out.println("The Computer is scissor. You are scissor. It is a draw");
	       if(computerGuess == 1)
		   System.out.println("The Computer is rock. You are scissor. You lost");
		         compCount++;
		   if(computerGuess == 2)
		   System.out.println("The Computer is paper. You are scissor. You win");
		         playerCount++; break;
	     case 1:
	       if(computerGuess == 0)	
		   System.out.println("The Computer is scissor. You are rock. You win");
	       if(computerGuess == 1)
		   System.out.println("The Computer is rock. You are rock. It is draw");
		         compCount++;
		   if(computerGuess == 2)
		   System.out.println("The Computer is paper. You are rock. You lose");
		         playerCount++; break;
	     case 2:
	       if(computerGuess == 0)	
		   System.out.println("The Computer is scissor. You are paper. You lose");
	       if(computerGuess == 1)
		   System.out.println("The Computer is rock. You are paper. You win");
		         compCount++;
		   if(computerGuess == 2)
		   System.out.println("The Computer is paper. You are paper. It is draw"); break;
	   }
	  }while(playerCount <= 2 && compCount <= 2);
   }

}
