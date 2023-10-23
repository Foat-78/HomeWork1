package Task;

import java.util.Scanner;

// 1. Напишите программу, которая принимает на вход координаты точки (X и Y),
// 2. причём X ≠ 0 и Y ≠ 0 и
// 3. выдаёт номер четверти плоскости, в которой находится эта точка.
public class Task17 {
    public static void main(String[] args) {
        System.out.println("Введите координаты точек (Х и Y) для определения номера четверти: ");
        Scanner scanner = new Scanner(System.in);
        int coordinatesX = scanner.nextInt();
        int coordinatesY = scanner.nextInt();
        if (coordinatesY == 0 || coordinatesX == 0) {
            System.out.println("Вы ввели координаты не соответствующие условию задачи: ");
        } else if (coordinatesX > 0 && coordinatesY > 0) {
            System.out.println("Координаты " + coordinatesX + ", " + coordinatesY + " -> второй четверти");
        } else if (coordinatesX > 0 && coordinatesY < 0) {
            System.out.println("Координаты " + coordinatesX + ", " + coordinatesY + " -> третей четверти");
        }else if (coordinatesX < 0 && coordinatesY < 0) {
            System.out.println("Координаты " + coordinatesX + ", " + coordinatesY + " -> четвётрой четверти");
        }else if (coordinatesX < 0 && coordinatesY > 0) {
            System.out.println("Координаты " + coordinatesX + ", " + coordinatesY + " -> первой четверти");
        }
    }
}
