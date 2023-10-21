package Lesson4;

public class ForI {
    public static void main(String[] args) {
        // Вывести первые 3 значения
        int[] numbers = {1, 2, 3, 4, 6};
        for (int i = 0; i < numbers.length - 2; i++) {
            System.out.print("Значение i -> " + i + " = ");
            System.out.println(numbers[i]);
                }
            // Практическое задание
            // Распечатать все четные числа из массива numbers3
//            int[] numbers2 = {1, 2, 3, 4, 6, 8};
//            for (int j = 0; j < numbers2.length; j++) {
//                if (numbers2[j] % 2 == 0) {
//                    System.out.println(numbers2[j]);
//                }

            System.out.println();
            int[] numbers3 = {1, 2, 3, 4, 6, 8};
            for (int number: numbers3) {
                if (number % 2 == 0) {
                    System.out.println(number);

            }
        }
    }
}
