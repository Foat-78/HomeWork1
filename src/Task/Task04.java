package Task;

import java.util.Map;
import java.util.Scanner;

// Напишите программу, которая на вход принимает три
// числа и выдаёт максимальное из этих чисел.
//Пример:
// 2, 3, 7 -> 7
// 44, 5, 78 -> 78
// 22, 3, 9 -> 22
public class Task04 {
    public static void main(String[] args) {
        System.out.print("Введите 1 число: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        System.out.print("Введите 2 число: ");
        Scanner scanner1 = new Scanner(System.in);
        int numbers1 = scanner1.nextInt();

        System.out.print("Введите 3 число: ");
        Scanner scanner2 = new Scanner(System.in);
        int numbers2 = scanner2.nextInt();

        // Решение через библиотеку
        int num = Math.max(numbers, numbers1);
        System.out.println(numbers + ", " + numbers1 + ", " + numbers2 + " -> " + Math.max(num, numbers2));

        // Костыльный способ решения задачи
        if (numbers > numbers2 & numbers > numbers1){
            System.out.println(numbers + ", " + numbers1 + ", " + numbers2 + " -> " + numbers);
        } else if (numbers1 > numbers & numbers1 > numbers2) {
            System.out.println(numbers + ", " + numbers1 + ", " + numbers2 + " -> " + numbers1);
        } else if (numbers2 > numbers & numbers2 > numbers1) {
            System.out.println(numbers + ", " + numbers1 + ", " + numbers2 + " -> " + numbers2);
        }
    }
}
