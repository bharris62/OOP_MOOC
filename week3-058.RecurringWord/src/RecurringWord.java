
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while(true) {
            System.out.printf("Type a word: ");
            String myWord = reader.nextLine();

            if(words.contains(myWord)){
                System.out.printf("You gave the word %s twice", myWord);
                break;
            }

            words.add(myWord);
        }
        
    }
}
