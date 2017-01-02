import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("Type the first number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.printf("Type the second number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        if (num1 == num2) {
            System.out.println("The numbers are equal!");
        } else if(num1 > num2){
            System.out.printf("Greater number: %d", num1);
        } else {
            System.out.printf("Greater number: %d", num2);
        }
    }
}
