package Task;

import java.util.Scanner;

// Напишите программу, которая принимает на вход
// цифру, обозначающую день недели, и проверяет,
// является ли этот день выходным.
// 6 -> да
// 7 -> да
// 1 -> нет
public class Task15 {
    public static void main(String[] args) {
        System.out.println("Введи число для поверки, является ли выходным: ");
        Scanner scanner = new Scanner(System.in);
        int numDay = scanner.nextInt();
        System.out.println(numDay == 6 || numDay == 7 ?
                numDay + " -> " + "Да" :
                numDay + " -> " + "Нет");
    }
}
