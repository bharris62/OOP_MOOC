
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("Type the first word: ");
        String firstWord = reader.nextLine();
        System.out.printf("Type the second word: ");
        String secondWord = reader.nextLine();

        int answer = firstWord.indexOf(secondWord);

        if(answer == -1) {
            System.out.printf("The word '%s' is not found in the word '%s'", secondWord, firstWord);
        } else {
            System.out.printf("The word '%s' is found in the word '%s'", secondWord, firstWord);
        }
    }
}
