
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        if (Math.max(number1, number2) == number1) {
            return Math.max(number1, number3);
        } else {
            return Math.max(number2, number3);
        }


    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}