package Task;

import java.util.Scanner;

// Задача 24: Напишите программу, которая
// принимает на вход число (А) и выдаёт сумму чисел
// от 1 до А.
// 7 -> 28
// 4 -> 10
// 8 -> 36
public class Task24 {
    public static void main(String[] args) {
        System.out.print("Введите число А для определения суммы чисел от 1 до А: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= numbers; i++) {
            count += i;
        }
        System.out.printf("%d -> %d", numbers, count);
    }
}
