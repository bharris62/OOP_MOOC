import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Type numbers: ");
        while(true) {
            int num = Integer.parseInt(reader.nextLine());

            if (num == -1){
                break;
            }
            count += 1;
            sum += num;
            average = (double)sum / count;

            if (num % 2 == 0) {
                even++;
            }else {
                odd++;
            }

        }
        System.out.println("Thank youi and see you later!");
        System.out.printf("The sum is %d \n", sum);
        System.out.printf("How many numbers: %d \n", count);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }
}
