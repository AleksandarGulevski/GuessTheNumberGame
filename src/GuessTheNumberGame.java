import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {

        int anyRandomNumber = (int) (Math.random() * 100) + 1;
        boolean isWinner = false;

        System.out.print("I`m thinking of a number between 1 and 100 (Including both).\n" +
                " Can you guess what it is?\n" +
                " Type a number: ");

        Scanner in = new Scanner(System.in);


        for (int i = 9; i >= 0; i--) {
            int yourGuess = 1;

            boolean isNumeric = false;//This will be set to true when numeric val entered
            while (!isNumeric)
                try {

                    int guess = in.nextInt();
                    in.nextLine();
                    isNumeric = true;//numeric value entered, so break the while loop

                    yourGuess = guess;
                } catch (InputMismatchException ime) {
                    //Display Error message
                    System.out.println("Invalid character found," +
                            " Please enter numeric values only !!");
                    in.nextLine();//Advance the scanner
                }

            System.out.println("You have " + i + " guess(es) left. Take a guess: ");

            if (yourGuess < 1 || yourGuess > 100) {
                System.out.println("That is not a valid number. Please enter a number between 1 and 100 (Including both).");
            } else {
                if (anyRandomNumber > yourGuess) {
                    System.out.println("Your guess is to low");
                } else if (anyRandomNumber < yourGuess) {
                    System.out.println("Your guess is to high");
                } else {
                    isWinner = true;
                    break;
                }
            }
        }

        if (isWinner) {
            System.out.println("You guess it right. You are the champion!");

        } else {
            System.out.println("Game Over. You did not guess the number i was thinking " +
                    "\nThe number i was thinking was " + anyRandomNumber);
        }
    }


}