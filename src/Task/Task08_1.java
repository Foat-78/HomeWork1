package Task;

import java.util.Arrays;
import java.util.Scanner;

// Допустим мы хотим, чтобы пользователь вводил в консоль
// любое слово или фразу, а мы могли бы вывести
// ему какое слово или фразу он ввёл.
public class Task08_1 {
    public static void main(String[] args) {
        System.out.println("Введи фразу или слово: ");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        String phrase1 = scanner.nextLine();
        String phrase2 = scanner.nextLine();
        String[] pras = {phrase, phrase1, phrase2};
        System.out.println(Arrays.toString(pras));
        System.out.println(phrase + ", " + phrase1 + ", " + phrase2 + ".");
    }
}
