
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Until what? ");
        int untilNum = Integer.parseInt(reader.nextLine());
        int startNum = 1;
        int sum =  0;

        while(startNum <= untilNum) {
            sum+=startNum;
            startNum++;
        }
        System.out.println("Sum is: " + sum);
    }
}
