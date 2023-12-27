package OOP.Lesson6.Work;

import java.util.Arrays;

public class Work00_29 {
    public static void main(String[] args) {
        Work00 result = new Work00();
        int[] res = result.reversArray(25,1,10);
        System.out.printf(Arrays.toString(res) + " -> ");
        Work00 result1 = new Work00();
        int[] res1 = result1.resRevArr(res);
        System.out.print(Arrays.toString(res1));
    }
}
