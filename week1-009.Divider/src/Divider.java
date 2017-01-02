
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.printf("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.printf("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        double doubleInt1 = num1;
        double doubleInt2 = num2;
        double total = doubleInt1 / doubleInt2;

        System.out.println("Division: " + num1 + " / " + num2 + " = " + total);

    }
}
