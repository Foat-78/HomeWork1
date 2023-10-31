package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_4 {
    public static void main(String[] args) {
        System.out.print("Введите число для определения дня недели: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Work00 dayOfWeek = new Work00();
        String day = dayOfWeek.numDay(num);
        System.out.printf("%d -> %s", num, day);
    }
}
