package Task;

import java.util.Scanner;

// Напишите программу, которая на вход принимает число (N),
// а на выходе показывает все чётные числа от 1 до N/
// Например:
// 5 -> 2, 4
// 8 -> 2, 4, 6, 8
public class Task08 {
    public static void main(String[] args) {
        System.out.print("Введи число N: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        System.out.print(numbers + " -> ");
        for (int i = 1; i <= numbers - 1; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(numbers % 2 == 0 ? numbers : " ");
    }
}
