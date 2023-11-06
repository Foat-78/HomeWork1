package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_18 {
    public static void main(String[] args) {
        System.out.println("Введите координаты X и Y для определения четверти:");
        Scanner scanner = new Scanner(System.in);
        double X = scanner.nextDouble();
        double Y = scanner.nextDouble();
        Work00 result = new Work00();
        System.out.printf("X = %.1f; Y = %.1f -> %s", X, Y, result.guarterCoordinates(X, Y));
    }
}