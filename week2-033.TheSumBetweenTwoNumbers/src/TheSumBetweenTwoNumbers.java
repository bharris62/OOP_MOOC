
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("First: ");
        int lowerBound = Integer.parseInt(reader.nextLine());
        System.out.printf("Last: ");
        int upperBound = Integer.parseInt(reader.nextLine());

        int sum = 0;

        while (lowerBound <= upperBound) {
            sum+= lowerBound;
            lowerBound++;
        }

        System.out.println("The sum is " + sum);
    }
}
