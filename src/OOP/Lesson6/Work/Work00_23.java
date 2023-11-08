package OOP.Lesson6.Work;

import java.util.Arrays;
import java.util.Scanner;

public class Work00_23 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Work00 result = new Work00();
        int[] arr = result.arr(6);
        System.out.printf(num + ": массив " + Arrays.toString(arr));
        Work00 result1 = new Work00();
        System.out.println(result1.presenceNum(arr, num));
    }
}
