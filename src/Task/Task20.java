package Task;

import java.util.Scanner;

//  Задача по теореме Пифогора
// 1. Напишите программу, которая принимает на вход координаты двух точек
// 2. и находит расстояние между ними в 2D пространстве.
// A (3,6); B (2,1) -> 5,09
// A (7,-5); B (1,-1) -> 7,21
public class Task20 {
    public static void main(String[] args) {
        System.out.println("Введите координаты двух точек для определения размера между ними");
        System.out.print("Ax = ");
        Scanner scanner = new Scanner(System.in);
        int Ax = scanner.nextInt();
        System.out.print("Аy = ");
        int Ay = scanner.nextInt();
        System.out.print("Bх = ");
        int Bx = scanner.nextInt();
        System.out.print("By = ");
        int By = scanner.nextInt();
        double result =  Math.sqrt(((Ax - Bx) * (Ax - Bx)) + ((By - Ay) * (By - Ay)));
        System.out.printf("A (" + Ax + ", " + Ay + "); " + "B (" + Bx + ", " + By + ");" + " -> " + "%.3f", result);
    }
}
