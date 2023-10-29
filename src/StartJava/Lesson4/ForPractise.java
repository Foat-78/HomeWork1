package StartJava.Lesson4;

public class ForPractise {
    public static void main(String[] args) {
        // Практическое задание №1
        // Распечатать все четные числа из массива numbers1.
        int[] numbers1 = {3, 2, 10, 5, 8};
        // Вариант 1
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] % 2 == 0) {
                System.out.println(numbers1[i]);
            }
        }
        // Вариант 2
        System.out.println("______");
        for (int numbers: numbers1) {
            if (numbers % 2 == 0){
                System.out.println(numbers);
            }
        }

        System.out.println("________");

        //Практическое задание №2
        // Распечатать все элементы под четными индексами из массива numbers
        // Вариант 1
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
            i+=1;
        }

        System.out.println("___________");
        // Вариант 2
        for (int i = 0; i < numbers1.length; i++) {
            if (i % 2 == 0){
                System.out.println(numbers1[i]);
            }
        }
    }
}
