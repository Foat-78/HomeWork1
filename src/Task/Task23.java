package Task;

import java.util.Scanner;

// 1. Напишите программу, которая принимает на вход число (N)
// 2. и выдаёт таблицу кубов чисел от 1 до N.
// 3 -> 1, 8, 27
// 5 -> 1, 8, 27, 64, 125
public class Task23 {
    public static void main(String[] args) {
        System.out.print("Ведите число N: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 1;
        System.out.printf("%d -> ", number);
        for (int i = 1; i < number; i++) {
            count = i * i * i;
            System.out.printf("%d, ", count);
        }
        System.out.printf("%d",number * number * number);
    }
}
