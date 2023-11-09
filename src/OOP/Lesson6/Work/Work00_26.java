package OOP.Lesson6.Work;

import java.util.Arrays;

public class Work00_26 {
    public static void main(String[] args) {
        Work00 result = new Work00();
        int[] arr = result.evenNumbers(6, 1, 123);
        System.out.printf(Arrays.toString(arr) + " -> ");
        Work00 result1 = new Work00();
        System.out.println(result1.numEvenIndex(arr));
    }
}
