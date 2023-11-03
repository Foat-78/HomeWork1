package OOP.Lesson6.Work;

import java.util.Scanner;
// где метод .maxNumbers() - перегрузка - это когда название метода одинаковое и на вход принимают
// разное количество с разными типами аргументов
public class Work00_5 {
    public static void main(String[] args) {
        System.out.print("Введи три числа для определения максимального значения из них: ");
        Scanner scanner = new Scanner(System.in);
        int maxNumbers = scanner.nextInt();
        int maxNumbers1 = scanner.nextInt();
        int maxNumbers2 = scanner.nextInt();
        Work00 maxNum = new Work00();
        int result = maxNum.maxNumbers(maxNumbers, maxNumbers1, maxNumbers2);
        System.out.printf("%d, %d, %d -> max = %d;", maxNumbers, maxNumbers1, maxNumbers2, result);
    }
}
