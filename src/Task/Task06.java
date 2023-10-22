package Task;

import java.util.Scanner;

// Напишите программу, которая на вход принимает число и выдаёт,
// является ли число чётным (делится ли оно на два без остатка).
// Например:
// 4 -> да
// -3 -> нет
// 7 -> нет
public class Task06 {
    public static void main(String[] args) {
        System.out.print("Введи число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number % 2 == 0 ?
                number + " -> " + "Да" :
                number + " -> " + "Нет");
    }
}
