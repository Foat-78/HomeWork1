package Lesson2;

public class MathOperations {
    public static void main(String[] args) {
        int x = 14;
        int y = 5;

        // Прибавление
        int sum = x + y;
        System.out.println(sum);

        // Вычитание
        int diff = x - y;
        System.out.println(diff);
        //System.out.println(x - y);

        // Умножение
        int multiply = x * y;
        System.out.println(multiply);

        // Деление
        y = 3;
        double divide =(double) x / y;
        System.out.println(divide);

        // Возведение в степень
        int ext = x * x;
        System.out.println(ext);

        // Инкремент
        x = x + 1;
        x++;
        x += 10;
        System.out.println(x);

        //x *=10;
        x /= 10;
        System.out.println(x);

        // Декремент
        x = x - 1;
        x--;
        System.out.println(x);

        // Остаток от деления
        int number = 4;
        // 4 - 2 - 2 = 0;
        // 5 - 2 - 2 = 1
        // 7 - 3 - 3 = 1ж
        int modulo = number % 2; // 0
        System.out.println(modulo);

        // Скобки (выставлять приоритет)
        int z = (2 + 2) * 2; // 8
        System.out.println(z);
    }
}
