
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here


        while(true) {
            System.out.printf("Type the password: ");
            String pWord = reader.nextLine();
            if (pWord.equals(password)) {
                System.out.println("Right!");
                System.out.println();
                System.out.println("The secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong");
            }
        }
    }
}
