package Task;

import java.util.Scanner;
// 1. Напишите программу, которая принимает на вход пятизначное число и
// 2. проверяет, является ли оно палиндромом.
// 14212 -> нет
// 23432 -> да
// 12821 -> да
public class Task19 {
    public static void main(String[] args) {
        System.out.print("Введите пятизначное число для определения полиндрома: ");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        // Вариант для пятизначного числа
//        if (numbers < 100000 && numbers > 999) {
//            System.out.println(numbers % 10 == numbers / 10000 & numbers / 1000 % 10 == numbers % 100 / 10 ?
//                    numbers + " -> " + "Да" :
//                    numbers + " -> " + "Нет");
//        }else {
//            System.out.println("Ввели не корректное число. Необходимо ввести пятизначное число!!!");
//        }

        // Вариант для любого количества числа
        int numbers1 = numbers;
        int reverse = 0;
        while (numbers != 0){
            int remainder = numbers % 10;
            reverse = reverse * 10 + remainder;
            numbers /= 10;
        }
        if (numbers1 == reverse){
            System.out.printf("%d -> Да", numbers1);
        }else System.out.printf("%d -> Нет", numbers1);
    }
}
