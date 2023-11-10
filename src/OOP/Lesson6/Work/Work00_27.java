package OOP.Lesson6.Work;

import java.util.Arrays;

public class Work00_27 {
    public static void main(String[] args) {
        Work00 result = new Work00();
        int[] arr = result.evenNumbers(20, 1, 6);
        System.out.printf(Arrays.toString(arr) + " -> ");
        Work00 result1 = new Work00();
        int[] arr1 = result1.multiplayNum(arr);
        result1.printArray(arr1, ", ");
    }
}
