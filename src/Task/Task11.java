package Task;
// 1. Напишите программу, которая выводит случайное
// трёхзначное число и удаляет вторую цифру этого
// числа.
// 456 -> 46
// 782 -> 72
// 918 -> 98

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = rnd.nextInt(1000);
        System.out.println(number <= 99 || number >= 999 ? "Ввели не трёхзначное число! Повторите: " : number + " -> " + number / 100 + number % 10);
    }
}
