package Task;

import java.util.Scanner;

// Напишите программу, которая принимает на
// вход число и проверяет, кратно ли оно
// одновременно 7 и 23.
// 14 -> нет
// 46 -> нет
// 161 -> да
public class Task14 {
    public static void main(String[] args) {
        System.out.print("Введи число для проверки кратности одновременно 7 и 23: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        System.out.println(numbers % 7 == 0 & numbers % 23 == 0 ?
                numbers + " -> " + "Да" :
                numbers + " -> " + "Нет");
    }
}
