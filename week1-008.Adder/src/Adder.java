
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.printf("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        System.out.printf("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        int total = num + num2;

        System.out.println("Sum of the numbers: " + total);
    }
}
