package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_8 {
    public static void main(String[] args) {
        System.out.print("Введите трёхзначное число для определения второго числа: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Work00 secondNum = new Work00();
        System.out.printf("%d -> %d", num, secondNum.secondNumbers(num));
    }
}
