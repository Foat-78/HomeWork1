package Task;

import java.util.Scanner;

// Напишите программу, которая принимает на
// вход два числа и проверяет, является ли одно
// число квадратом другого.
// 5, 25 -> да
// -4, 16 -> да
// 25, 5 -> да
// 8, 9 -> нет
public class Task16 {
    public static void main(String[] args) {
        System.out.println("Ведите 2 числа для проверки, является ли одно число квадратом другого: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(number1 % number2 == 0 || number2 % number1 == 0 ?
                number1 + ", " + number2 + " -> " + "Да" :
                number1 + ", " + number2 + " -> " + "Нет");
    }
}
