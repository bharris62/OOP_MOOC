
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.printf("Type your username: ");
        String uName = reader.nextLine();
        System.out.printf("Type your password: ");
        String pWord = reader.nextLine();

        if (uName.equals("alex") && pWord.equals("mightyducks") || uName.equals("emily") && pWord.equals("cat") ) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
