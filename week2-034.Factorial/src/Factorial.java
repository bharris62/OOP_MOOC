import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("Type a number: ");
        int factorial = Integer.parseInt(reader.nextLine());
        int factAnswer = 1;

        if(factorial == 0) {
            factAnswer = 1;
        }

        while (factorial >= 1) {
            factAnswer *= factorial;
            factorial--;
        }

        System.out.println("Factorial is " + factAnswer);
    }
}
