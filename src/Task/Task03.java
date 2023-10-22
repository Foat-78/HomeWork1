package Task;

import java.util.Scanner;

// Напишите программу, которая будет выдавать
// название дня недели по зaдaнному номеру.
// 2 -> Среда
// 5 - > Пятница
public class Task03 {
    public static void main(String[] args) {
        System.out.print("Введите номер дня недели для определения названия: ");
        Scanner scanner = new Scanner(System.in);
        int numDay = scanner.nextInt();
        switch (numDay){
            case 1 -> System.out.println("1 -> Понедельник");
            case 2 -> System.out.println("2 -> Вторник");
            case 3 -> System.out.println("3 -> Среда");
            case 4 -> System.out.println("4 -> Четверг");
            case 5 -> System.out.println("5 -> Пятница");
            case 6 -> System.out.println("6 -> Суббота");
            case 7 -> System.out.println("7 -> Воскресенье");
            default -> System.out.println(numDay + " -> Такой недели не существует");
        }
    }
}
