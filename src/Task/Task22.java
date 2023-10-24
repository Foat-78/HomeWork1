package Task;

import java.util.Scanner;

// 1. Напишите программу, которая принимает на вход число (N)
// 2. и выдаёт таблицу квадратов чисел от 1 до N.
public class Task22 {
    public static void main(String[] args) {
        System.out.print("Введите число N: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Квадрат числа " + i + " = " + i * i);
        }
    }
}
