package Task;

import java.util.Scanner;

// Напишите программу, которая принимает на вход
// трёхзначное число и на выходе показывает
// вторую цифру этого числа.
// 456 -> 5
// 782 -> 8
// 918 -> 1
public class Task10 {
    public static void main(String[] args) {
        System.out.println("Введите трехзначное число: ");
        Scanner scanner = new Scanner(System.in);
        int numder = scanner.nextInt();
        System.out.println(numder >= 999 || numder <= 99 ?
                "Вы ввели не трёхзначное число! Повторите: " :
                numder + " -> " + numder / 10 % 10);
    }
}
