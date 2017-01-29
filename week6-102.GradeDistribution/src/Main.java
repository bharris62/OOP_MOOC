import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        GradeDistribution grades = new GradeDistribution();

        System.out.println("Type exam scores, -1 completes:");

        while (true){
            int num = Integer.parseInt(scanner.nextLine());

            if (num == -1) {
                break;
            }
            grades.addGrades(num);

        }
        System.out.println("Grade distribution: ");
        grades.distributeGrades();
        grades.printGradeStars();
        System.out.println("Acceptance percentage: " + grades.acceptancePercentage());
    }
}
