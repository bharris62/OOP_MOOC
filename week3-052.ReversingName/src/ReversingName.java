import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("Type your name: ");
        String name = reader.nextLine();

        int count = name.length()-1;

        System.out.printf("In reverse order: ");
        while (count >= 0) {
            System.out.print(name.charAt(count));
            count--;
        }


    }
}
