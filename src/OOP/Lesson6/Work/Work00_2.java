package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_2 {
    public static void main(String[] args) {
        System.out.println("Введите два числа для определения квадрата числа второго: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        Work00 perfectSec = new Work00();
        String result = perfectSec.perfectSecond(number1, number2);
        System.out.printf("%d, %d -> %s ", number1, number2, result);
    }
}
