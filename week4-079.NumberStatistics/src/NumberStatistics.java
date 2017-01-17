
public class NumberStatistics {
    private int amountOfNumbers;
    private int totalSum;

    public NumberStatistics(){
        this.amountOfNumbers = 0;
        this.totalSum = 0;

    }

    public void addNumber(int number){
        amountOfNumbers++;
        totalSum += number;
    }

    public int amountOfNumbers(){

        return amountOfNumbers;
    }

    public int sum(){
        return totalSum;
    }

    public double average(){
        if (amountOfNumbers == 0) {
            return 0;
        }
        return (double)totalSum / amountOfNumbers;

    }
}
