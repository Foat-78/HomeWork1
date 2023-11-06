package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_15 {
    public static void main(String[] args) {
        System.out.println("Введите число для проверки кратности числам 7 и 23: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Work00 multiplay = new Work00();
        System.out.println(multiplay.multipleNumbers(num));
    }
}
