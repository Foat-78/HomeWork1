package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_9 {
    public static void main(String[] args) {
        System.out.print("Введите число N: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Work00 result = new Work00();
        System.out.printf(result.evenNumbers(num));
    }
}
