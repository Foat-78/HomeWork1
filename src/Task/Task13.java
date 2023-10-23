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
        int numbers = rnd.nextInt(1999);
        System.out.println(numbers);
        System.out.println(numbers <= 99 ?
                numbers + " -> " + "третьей цифры нет" :
                numbers + " -> " + numbers % 1000 / 100);
    }
}
