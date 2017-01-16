import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int count = 0;

        for (int num : list) {
            count+=num;
        }
        return count;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avg = sum(list)/(double)list.size();
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        double numerator = 0;
        double theAverages = average(list);

        for (int num : list) {
            double numbers = (num - theAverages);
            numerator +=Math.pow(numbers,2);
        }

        double var = numerator / (list.size() - 1);
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
