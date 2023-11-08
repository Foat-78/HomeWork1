package OOP.Lesson6.Work;

import java.util.Arrays;

public class Work00_21 {
    public static void main(String[] args) {
        Work00 result = new Work00();
        int[] arr = result.sumNumbers(12, -9, 9);
        System.out.println(Arrays.toString(arr));
        Work00 result1 = new Work00();
        System.out.println(result1.sumPositiveAndNegative(arr));
    }
}
