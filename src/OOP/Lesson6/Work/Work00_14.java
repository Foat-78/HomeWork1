package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_14 {
    public static void main(String[] args) {
        System.out.print("Введите натуральное число: ");
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        Work00 result = new Work00();
        System.out.println(result.thirdNumbers(num));
    }
}
