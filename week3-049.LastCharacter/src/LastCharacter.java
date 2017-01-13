import java.util.Scanner;


public class LastCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("Type your name: ");

        String name = reader.nextLine();

        System.out.println("Last Character: " + lastCharacter(name));
    }

    public static char lastCharacter(String name) {
        //minus one because of 0 index.
        char lastLetter = name.charAt(name.length() -1);

        return lastLetter;
    }
}
