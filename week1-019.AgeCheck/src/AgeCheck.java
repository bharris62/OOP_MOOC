import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());

        if (age >= 0 && age <= 120 ) {
            System.out.println("OK");
        } else if (age < 0 || age > 120) {
            System.out.println("Impossible!");
        }

    }
}
