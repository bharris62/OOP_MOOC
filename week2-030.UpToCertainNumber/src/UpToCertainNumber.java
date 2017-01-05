
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.printf("Up to what number? ");
        int upTo = Integer.parseInt(reader.nextLine());
        int startNum = 1;

        while (startNum < upTo+1 ) {
            System.out.println(startNum);
            startNum+=1;
        }
        
    }
}
