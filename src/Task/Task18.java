package Task;
// 1. Напишите программу, которая по заданному номеру четверти,
// 2. показывает диапазон возможных координат точек в этой четверти (x и y).

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        System.out.println("Введите четверть диапазона координат: ");
        Scanner scanner = new Scanner(System.in);
        byte numQuarterCoordinate = scanner.nextByte();
        switch (numQuarterCoordinate){
            case 1 -> System.out.println("Вы указали диапазон координат - X и Y");
            case 2 -> System.out.println("Вы указали диапазон координат  X и Y");
            case 3 -> System.out.println("Вы указали диапазон координат  X и - Y");
            case 4 -> System.out.println("Вы указали диапазон координат - X и - Y");
            default -> System.out.println("Такой четверти в системе координат не существует");
        }
    }
}
