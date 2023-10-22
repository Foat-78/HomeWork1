package Task;

import java.util.Scanner;

// Напишите программу, которая на вход принимает
// одно число (N), а на выход показывает все целые числа в промежутке от -N до N.
// 4 -> "-4, -3, -2, -1, 0, 1, 2, 3, 4"
// 2 -> "-2, -1, 0, 1, 2"
public class Task05 {
    public static void main(String[] args) {
        System.out.print("Введи число N: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        // Первый способ решения задачи
        System.out.print(N + " -> " + '"');
        for (int i = - N; i < N + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println('"' + "\n");

        // Второй способ решения задачи
        int count = - N;
        System.out.print(N + " -> " + '"');
        while (N >= count){
            System.out.print(count + " ");
            count++;
        }
        System.out.println( '"');
    }
}
