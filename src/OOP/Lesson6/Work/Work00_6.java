package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_6 {
    public static void main(String[] args) {
        System.out.print("Введи натуральное число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Work00 numInt = new Work00();
        System.out.print(numInt.numIntExit(num));
    }
}
