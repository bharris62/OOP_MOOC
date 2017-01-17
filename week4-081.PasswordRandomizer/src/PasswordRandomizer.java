import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private String abc = "abcdefghijklmnopqrstuvwxyz";
    Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String randomPass = "";
        int i = 0;
        while(i < this.length){
            randomPass += this.abc.charAt(random.nextInt(abc.length()));
            i++;
        }
        return randomPass;
    }
}
