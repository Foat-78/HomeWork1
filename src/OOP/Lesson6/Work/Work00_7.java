package OOP.Lesson6.Work;

import java.util.Scanner;

public class Work00_7 {
    public static void main(String[] args) {
        System.out.print("Введите число для определения чётности: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        Work00 evenNum = new Work00();
        System.out.println(evenNum.evenNumber(numbers));
    }
}
