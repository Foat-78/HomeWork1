package Task;

import java.util.Scanner;

// 1. Напишите программу, которая на входе принимает два
// числа и проверяет, является ли первое число квадратом второго.
public class Task01 {
    public static void main(String[] args) {
        System.out.print("Введите число А: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print("Введите число B: ");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();
        if (number * number == number1) {
            System.out.println("Первое число является квадратом второго: " + number + " -> " + number1);
        }else {
            System.out.println("Первое число не является квадратом второго: " + number + " !^ " + number1);
        }
    }
}
