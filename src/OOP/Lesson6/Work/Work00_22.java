package OOP.Lesson6.Work;

import java.util.Arrays;

public class Work00_22 {
    public static void main(String[] args) {
        Work00 result = new Work00();
        int[] arr = result.arrays(6, -9, 9);
        System.out.printf(Arrays.toString(arr) + " -> ");
        Work00 result1 = new Work00();
        System.out.println(Arrays.toString(result1.replaceOfElementsArrays(arr)));
    }
}
