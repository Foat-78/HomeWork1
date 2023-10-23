package Task;

import java.util.Scanner;

// Напишите программу, которая будет принимать на
// вход два числа и выводить, является ли первое число
// кратным второму. Если первое число не кратно
// второму, то программа выводит остаток от деления.
// 34, 5 -> не кратно, остаток 4
// 16, 4 -> кратно
public class Task12 {
    public static void main(String[] args) {
        System.out.println("Введите 2 числа для определения кратности первого значения ко второму: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(num1 % num2 == 0 ?
                num1 + ", " + num2 + ", " + " -> " + "кратно" :
                num1 + ", " + num2 + ", " + " -> " + "не кратно, остаток " + num1 % num2);
    }
}
