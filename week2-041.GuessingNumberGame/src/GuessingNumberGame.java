
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int guessMade = 1;
        while (true) {
            System.out.printf("Guess a number: ");
            int numberGuess = Integer.parseInt(reader.nextLine());

            if (numberDrawn == numberGuess) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (numberDrawn < numberGuess) {
                System.out.println("The number is lesser, guesses made: " + guessMade);
                guessMade++;
            } else {
                System.out.println("The number is greater, guesses made: " + guessMade);
                guessMade++;
            }
        }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
