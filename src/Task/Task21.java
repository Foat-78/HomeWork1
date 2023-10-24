package Task;

import java.util.Scanner;

// 1. Напишите программу, которая принимает на вход координаты двух точек
// 2. и находит расстояние между ними в 3D пространстве.
// A (3,6,8); B (2,1,-7), -> 15.84
// A (7,-5, 0); B (1,-1,9) -> 11.53
public class Task21 {
    public static void main(String[] args) {
        System.out.println("Введите координаты двух точек для определения размера между ними");
        System.out.print("Ax = ");
        Scanner scanner = new Scanner(System.in);
        int Ax = scanner.nextInt();
        System.out.print("Аy = ");
        int Ay = scanner.nextInt();
        System.out.print("Аz = ");
        int Az = scanner.nextInt();
        System.out.print("Bх = ");
        int Bx = scanner.nextInt();
        System.out.print("By = ");
        int By = scanner.nextInt();
        System.out.print("Bz = ");
        int Bz = scanner.nextInt();
        double result =  Math.sqrt(((Ax - Bx) * (Ax - Bx)) + ((By - Ay) * (By - Ay)) + ((Az - Bz) * (Az - Bz)));
        System.out.printf("A (" + Ax + ", " + Ay + ", " + Az + "); " + "B (" + Bx + ", " + By + ", " + Bz + ");" + " -> " + "%.3f", result);
    }
}
