package Task;

import java.util.Random;

// Напишите программу, которая выводит третью
// цифру заданного числа или сообщает,
// что третьей цифры нет.
// 645 -> 5
// 78 -> третьей цифры нет
// 32679 -> 6
public class Task13 {
    public static void main(String[] args) {
        System.out.print("Введите число для определения третьей цифры: ");
        Random rnd = new Random();
        int numbers = rnd.nextInt(99999);
        System.out.printf("%d -> ", numbers);
        if (numbers <= 99){
            System.out.print("третьей цифры нет");
        } else {
            int reverse = 0;
            while (numbers != 0){
                int remainder = numbers % 10;
                reverse = reverse * 10 + remainder;
                numbers /= 10;
            }
            System.out.printf("%d", reverse / 100 % 10);
        }
    }
}
