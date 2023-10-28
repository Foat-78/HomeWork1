package Task;

import java.util.Scanner;

// Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее
// и какое число меньшее?
//Например:
// a = 5; b = 7 -> max = 7
// a = 2; b = 10 -> max = 10
// a = -9; b = -3 -> max = -3
public class Task02 {
    public static void main(String[] args) {
        System.out.print("Введите первое число a: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.print("Введите второе число b: ");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();

        if (number > number1) {
            System.out.println("a = " + number + ";" + " b = " + number1 + " -> " + "max = " + number);
        }else {
            System.out.println("a = " + number + ";" + " b = " +number1 + " -> " + "max = " + number1);
        }

        // Решение тернарником
        System.out.println(number > number1 ?
                "a = " + number + ";" + " b = " + number1 + " -> " + "max = " + number :
                "a = " + number + ";" + " b = " +number1 + " -> " + "max = " + number1);
    }
}
