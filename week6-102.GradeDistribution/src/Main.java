import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        GradeDistribution grades = new GradeDistribution();

        System.out.println("Type exam scores, -1 completes:");

        while (true){
            int num = Integer.parseInt(scanner.nextLine());

            if (num == -1) {
                break;
            }
            grades.addGrades(num);

        }

        System.out.println(grades.acceptancePercentage());
        grades.printGradeStars();
    }
}
