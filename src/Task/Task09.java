package Task;

import java.util.Random;

//Напишите программу, которая выводит
//случайное число из отрезка [10, 99] и показывает
//наибольшую цифру числа.
// 78 -> 8
// 12-> 2
// 85 -> 8
public class Task09 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int number = rnd.nextInt(10, 99);
        System.out.print(number / 10 >= number % 10 ?
                number + " -> " + number / 10 :
                number + " -> " + number % 10);
    }
}
