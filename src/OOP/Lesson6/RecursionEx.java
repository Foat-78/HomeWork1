package OOP.Lesson6;

public class RecursionEx {
    public static void main(String[] args) {
        // Рекурсия
        // Задача: посчитать сумму всех чисел от 1 до значения k
        long k = 1280;
        Recursion recursion = new Recursion();
        long result = recursion.sum(k);
        System.out.println(result);
    }
}
