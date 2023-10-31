package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_1 {
    public static void main(String[] args) {
        System.out.print("Введите число для определения квадра числа: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Work00 perfectSq = new Work00();
        int result = perfectSq.perfectSquare(number);
        System.out.printf("%d -> %d", number, result);
    }
}
