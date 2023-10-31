package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_3 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа для определения максимального из них: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Work00 maxNum = new Work00();
        int result = maxNum.maxNumbers(num1, num2);
        System.out.printf("%d, %d -> max = %d", num1, num2, result);
    }
}
