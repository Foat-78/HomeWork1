package Task;

import java.util.Scanner;

// Напишите программу, которая принимает на вход
// трёхзрачное число и выход показывает последнюю цифру
//этого числа.
// 456 -> 6
// 782 -> 2
// 918 -> 8
public class Task07 {
    public static void main(String[] args) {
        System.out.print("Введи трехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        System.out.println(numbers + " -> " + numbers % 10);
    }
}
