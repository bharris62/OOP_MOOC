
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.printf("Type your name: ");
        String name1 = reader.nextLine();
        System.out.println("Type your age: ");
        int age1 = Integer.parseInt(reader.nextLine());

        System.out.printf("Type your name: ");
        String name2 = reader.nextLine();
        System.out.println("Type your age: ");
        int age2 = Integer.parseInt(reader.nextLine());

        int totalAge = age1 + age2;

        System.out.printf("%s and %s are %d years old in total.", name1, name2, totalAge);
    }
}
