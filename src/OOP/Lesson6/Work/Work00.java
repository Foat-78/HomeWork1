package OOP.Lesson6.Work;

public class Work00 {
    // Задача 01
    // 1. на входе принимает число и
    // 2. выдаёт его квадрат (число умноженное на само
    //  себя)

    // Например:
    // 4 -> 16
    // -3 -> 9
    // -7 -> 49
    public int perfectSquare(int number){
        int perfect = number * number;
        return perfect;
    }

    // Задача 02
    // 1. Напишите программу, которая на входе принимает два
    // числа и проверяет, является ли первое число квадратом второго.
    public String perfectSecond (int num1, int num2){
        if(num1 * num1 == num2){
            return "первое число является квадратом второго числа";
        } else if (num2 * num2 == num1){
            return "второе число является квадратом первого числа";
        } else {
            return "первое число не является квадратом второго и наоборот";
        }
    }

    // Задача 03
    // Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее
    // и какое число меньшее?
    //Например:
    // a = 5; b = 7 -> max = 7
    // a = 2; b = 10 -> max = 10
    // a = -9; b = -3 -> max = -3

    public int maxNumbers (int a, int b){
        return a > b ? a : b;
    }

    // Задача 04
    // Напишите программу, которая будет выдавать
    // название дня недели по зпдпнному номеру.
    // 2 -> Среда
    // 5 - > Пятница

    public String numDay(int num) {
        switch (num) {
            case 1: return "Понедельник";
            case 2: return "Вторник";
            case 3: return "Среда";
            case 4: return "Четверг";
            case 5: return "Пятница";
            case 6: return "Суббота";
            case 7: return "Воскресенье";
            default: return "Данного дня недели не существует";
        }
    }

    // Задача 05
    // Напишите программу, которая на вход принимает три
    // числа и выдаёт максимальное из этих чисел.
    //Пример:
    // 2, 3, 7 -> 7
    // 44, 5, 78 -> 78
    // 22, 3, 9 -> 22

    // Метод перегрузка
    public int maxNumbers(int num1, int num2, int num3){
        // Первый вариант
//        if (num2 > num1 & num2 > num3){
//            return num2;
//        } else if (num1 > num2 & num1 > num3) {
//            return num1;
//        }else return num3;

        // Второй вариант
        return num2 > num1 & num2 > num3 ? num2 : num1 > num2 & num1 > num3 ? num1 : num3;
    }

    // Задача 06
    // Напишите программу, которая на вход принимает
    // одно число (N), а на выход показывает все целые числа в промежутке от -N до N.
    // 4 -> "-4, -3, -2, -1, 0, 1, 2, 3, 4"
    // 2 -> "-2, -1, 0, 1, 2"

    public int numIntExit(int numInt) {
        System.out.printf("%d -> ", numInt);
        int count = -numInt;
        while (count + 1 <= numInt) {
            System.out.print(count + ", ");
            count++;
        }
        return count;
    }

    // Задача 07
    // Напишите программу, которая на вход принимает число и выдаёт,
    // является ли число чётным (делится ли оно на два без остатка).
    // Например:
    // 4 -> да
    // -3 -> нет
    // 7 -> нет

    public String evenNumber(int num){
            return String.format("%d -> %s", num, num % 2 == 0 ? "Да" : "Нет");
    }

    // Задача 08
    // Напишите программу, которая принимает на вход
    // трёхзрачное число и выход показывает последнюю цифру
    //этого числа.
    // 456 -> 6
    // 782 -> 2
    // 918 -> 8

    public int secondNumbers (int num){
        return num / 10 % 10;
    }

    // Задача 09
    // Напишите программу, которая на вход принимает число (N),
    // а на выходе показывает все чётные числа от 1 до N/
    // Например:
    // 5 -> 2, 4
    // 8 -> 2, 4, 6, 8

    public String evenNumbers(int numbers) {
        System.out.printf("%d -> \"", numbers);
          for (int i = 2; i < numbers ; i++) {
               System.out.print(i % 2 == 0 ? i  : ", ");
          }
        return String.format(numbers % 2 == 0 ? numbers + "\"" : "\"" );
    }

    // Задача 10
    // Напишите программу, которая выводит
    // случайное число из отрезка [10, 99] и показывает
    // наибольшую цифру числа.
    // 78 -> 8
    // 12-> 2
    // 85 -> 8

    public String maxRandomeNumbers(int numbers){
        return String.format("%d -> %s", numbers, numbers % 10 > numbers / 10 ?
                numbers % 10 : numbers % 10 == numbers / 10 ? "Равны" : numbers / 10);
    }

    // задача 11
    // Напишите программу, которая принимает на вход
    // трёхзначное число и на выходе показывает
    // вторую цифру этого числа.
    // 456 -> 5
    // 782 -> 8
    // 918 -> 1

    public String maxFreeDigitNumber(int numbers){
        return String.format("%d -> %s", numbers, numbers / 10 % 10);
    }

    // Задача 12
    // Напишите программу, которая выводит случайное
    // трёхзначное число и удаляет вторую цифру этого
    // числа.
    // 456 -> 46
    // 782 -> 72
    // 918 -> 98

    public String firstAndThirdNumbers(int numbers){
        return String.format("%d -> %d%d", numbers, numbers / 100 % 10, numbers % 10);
    }

    // Задача 13
    // Напишите программу, которая будет принимать на
    // вход два числа и выводить, является ли первое число
    // кратным второму. Если первое число не кратно
    // второму, то программа выводит остаток от деления.
    // 34, 5 -> не кратно, остаток 4
    // 16, 4 -> кратно

    public String multipleNumbers(int num1, int num2){
//        return String.format("%d, %d -> %s", num1, num2, num1 % num2 == 0 ? "кратно" : "не кратно, остаток " + num1 % num2);
        if (num1 % num2 == 0 | num2 % num1 == 0){
            return String.format("%d, %d -> кратно", num1, num2);
        }else return "не кратно, остаток " + num1 % num2;
    }

    // Задача 14
    // Напишите программу, которая выводит третью
    // цифру заданного числа или сообщает,
    // что третьей цифры нет.
    // 645 -> 5
    // 78 -> третьей цифры нет

    // 32679 -> 6
    public String thirdNumbers(long num) {
        System.out.printf("%d -> ", num);
        // Первый вариант - когда число делим на 10 до того как будет трёхзначная цифра и выводим остаток от деления на 10
//        if (num > 999){
//            while (num > 999){
//                num = num / 10;
//            }
//            return String.format("%d", num % 10);
//        } else if (num > 100) {
//            return String.format("%d", num % 10);
//        }else{
//            return "третьей цифры нет";
//        }



        // Второй вариант - это когда заданное число переворачиваем и делим на 100 и выводим остаток от деления на 10
        if (num < 99){
            return "третьей цифры нет";
        }else {
            long reverse = 0;
            while (num != 0){
                long remainder = num % 10;
                reverse = reverse * 10 + remainder;
                num = num / 10;
            }
            return String.format("%d", reverse / 100 % 10);
        }
    }
}

