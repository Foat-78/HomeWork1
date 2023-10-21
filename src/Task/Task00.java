package Task;
// 1. на входе принимает число и
// 2. выдаёт его квадрат (число умноженное на само
//  себя)

import java.util.Scanner;

// Например:
// 4 -> 16
// -3 -> 9
// -7 -> 49
public class Task00 {
    public static void main(String[] args) {
        System.out.print("Введите число N: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number + " -> " + number * number);
    }
}
