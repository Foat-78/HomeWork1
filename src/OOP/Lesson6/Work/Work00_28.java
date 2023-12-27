package OOP.Lesson6.Work;

import java.util.Arrays;

public class Work00_28 {
    public static void main(String[] args) {
        Work00 result = new Work00();
        double[] doubles = result.doubArray(5, 1, 99);
        System.out.println(Arrays.toString(doubles));
        Work00 result2 = new Work00();
        String[] print = result2.printArray(doubles);
        System.out.print(Arrays.toString(print));
        Work00 result1 = new Work00();
        String res = result1.differenceMinMax(doubles);
        System.out.println(res);
    }

}
