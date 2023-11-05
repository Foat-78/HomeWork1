package Task;

import java.util.Scanner;

// Задача 25: Напишите цикл,
//  который принимает на вход два числа (A и B)
//  и возводит число A в натуральную степень B.
// 3, 5 -> 243 (3⁵)
// 2, 4 -> 16
public class Task29 {
    public static void main(String[] args) {
        System.out.println("Введите два числа: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int num1 = scanner.nextInt();
        int i = 0;
        int num2 = 1;
        while (i < num1){
            num2 = num2 * num;
            i++;
        }
        System.out.printf("%d, %d -> %d", num, num1, num2);
    }
}
