package Task;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("int a: ");
        boolean flag = scanner.hasNextInt(); // для проверки на соответствие получаемого типа
        System.out.println(flag);
        int i = scanner.nextInt();
        System.out.println(i);
        scanner.close();
    }

}
