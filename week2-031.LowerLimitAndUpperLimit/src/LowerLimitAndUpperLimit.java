
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.printf("First: ");
        int lowerNum = Integer.parseInt(reader.nextLine());
        System.out.printf("Last: ");
        int upperNum = Integer.parseInt(reader.nextLine());

        if (lowerNum > upperNum) {
            ;
        }
        while (lowerNum <= upperNum) {
            System.out.println(lowerNum);
            lowerNum++;
        }

    }
}
