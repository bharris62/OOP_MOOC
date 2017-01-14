import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<>();

        while(true) {
            System.out.printf("Type a word: ");
            String word = reader.nextLine();
            if(word.equals("")) {
                break;
            }
            words.add(word);

            }

        Collections.reverse(words);
        System.out.println("You typed the following words:");
        for(String thisWord : words) {
//            int count = thisWord.length() - 1;
//
//            while(count >= 0) {
//                System.out.print(thisWord.charAt(count));
//                count--;
//
//            }
//            System.out.print("\n");
            System.out.println(thisWord);

        }
    }
}
