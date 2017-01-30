import java.util.*;
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallnum = array[0];

        for(int currNum : array) {
            if (currNum <= smallnum) {
                smallnum = currNum;
            }
        }
        return smallnum;
    }

    public static int indexOfTheSmallest(int[] array){
        int idxOfSmall = 0;
        for(int i =0; i <= array.length -1; i++){
            if (array[i] == smallest(array)) {
                idxOfSmall = i;
            }
        }
        return idxOfSmall;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallIndex = index;
        for(int i = index; i < array.length; i++) {
            if(array[i] < array[smallIndex]) {

                smallIndex = i;
            }
        }
        return smallIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int[] arry = array;
        int temp = arry[index1];
        arry[index1] = arry[index2];
        arry[index2] = temp;

    }

    public static void sort(int[] array) {

        for(int i = 0; i < array.length; i++){
            int indexSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexSmallest);
            System.out.println(Arrays.toString(array));
        }
    }
}