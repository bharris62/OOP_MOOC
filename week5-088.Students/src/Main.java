
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here the main program
        ArrayList<Student> students = new ArrayList();

        while(true) {
            System.out.print("name: ");
            String name = reader.nextLine();

            if(name.equals("")){
                break;
            } else {
                System.out.print("studentnumber: ");
                String studentNumber = reader.nextLine();
                students.add(new Student(name, studentNumber));
            }
        }

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.print("Give search term: ");
        System.out.println("result:");
        String searcher = reader.nextLine();
        for(Student s : students) {
            if(s.getName().contains(searcher)) {
                System.out.println(s);
            }
        }

    }
}