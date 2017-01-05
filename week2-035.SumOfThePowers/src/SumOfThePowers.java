
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int sum = 1;

        while (num > 0) {
            sum = sum + (int)Math.pow(2, num);
            num--;
        }
        System.out.println(sum);
    }
}
