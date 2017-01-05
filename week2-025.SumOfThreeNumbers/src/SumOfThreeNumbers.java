
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        int count = 0;


        // Write your program here
        // Use only variables sum and read
        while (count < 3) {
            System.out.printf("Enter a number: ");
            read = Integer.parseInt(reader.nextLine());
            sum += read;
            count += 1;

        }

        System.out.println("Sum: " + sum);
    }
}
