import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

       public static void main(String[] args) {

            int anyRandomNumber = (int) (Math.random() * 100) + 1;
            boolean winner = false;

           System.out.print("I`m thinking of a number between 1 and 100 (Including both).\n" +
                   " Can you guess what it is?\n" +
                   " Type a number: ");

           Scanner in = new Scanner (System.in);
           for (int i = 10; i >0; i--) {
               System.out.println("You have " + i + " guess(es) left. Take a guess: ");
               int yourGuess = in.nextInt();

               if (anyRandomNumber > yourGuess) {
                   System.out.println("Your guess is to low");


               } else if (anyRandomNumber < yourGuess) {
                   System.out.println("Your guess is to high");


               } else {
                 winner = true;
                 break;


               }
           }

           if (winner) {
               System.out.println("You guess it right. You are the champion!");

           } else {
               System.out.println("Game Over. You did not guess the number i was thinking ");
               System.out.println("The number i was thinking was " + anyRandomNumber);
           }
       }




}


