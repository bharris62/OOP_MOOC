
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<>();

        while(true) {
            System.out.printf("Type a word: ");
            String word = reader.nextLine();

            if (word.equals("")){break;}

            words.add(word);

        }

        Collections.sort(words);
        System.out.println("You typed the following words: ");
        for(String thisWord : words) {
            System.out.println(thisWord);
        }
    }
}
