package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_13 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа для определения кратности:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        Work00 multNum = new Work00();
        System.out.println(multNum.multipleNumbers(num1, num2));
    }
}
