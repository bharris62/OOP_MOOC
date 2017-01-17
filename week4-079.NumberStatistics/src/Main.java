import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");

        while(true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            } else if (number % 2 == 0) {
                even.addNumber(number);
                stats.addNumber(number);
            } else {
                odd.addNumber(number);
                stats.addNumber(number);
            }


        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}
