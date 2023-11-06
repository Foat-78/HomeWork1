package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_17 {
    public static void main(String[] args) {
        System.out.println("Введите два числа для определения квадрата числа первого второму: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        Work00 result = new Work00();
        System.out.println(result.multiplay(num, num1));
    }
}
