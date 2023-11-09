package OOP.Lesson6.Work;

import java.util.Random;

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

    // Задача 15
    // Напишите программу, которая принимает на
    // вход число и проверяет, кратно ли оно
    // одновременно 7 и 23.
    // 14 -> нет
    // 46 -> нет
    // 161 -> да

    public String multipleNumbers(int num){
        return num % 7 == 0 & num % 23 == 0 ? num + " -> Да" : num + " -> Нет";
    }

    // Задача 16
    // Напишите программу, которая принимает на вход
    // цифру, обозначающую день недели, и проверяет,
    // является ли этот день выходным.
    // 6 -> да
    // 7 -> да
    // 1 -> нет

    public String DayOffOfTheWeek(int num){
        System.out.printf("%d -> ", num);
        switch (num) {
            case 1:
                return "Нет";
            case 2:
                return "Нет";
            case 3:
                return "Нет";
            case 4:
                return "Нет";
            case 5:
                return "Нет";
            case 6:
                return "Да";
            case 7:
                return "Да";
            default:
                return "Такой недели не существует";
        }
    }

    // Задача 17
    // Напишите программу, которая принимает на
    // вход два числа и проверяет, является ли одно
    // число квадратом другого.
    // 5, 25 -> да
    // -4, 16 -> да
    // 25, 5 -> да
    // 8, 9 -> нет

    public String multiplay(int num, int num1){
        return String.format("%d, %d -> %s", num, num1, num * num == num1 ? "Да" : "Нет");
    }

    //Задача 18
    // 1. Напишите программу, которая принимает на вход координаты точки (X и Y),
    // 2. причём X ≠ 0 и Y ≠ 0 и
    // 3. выдаёт номер четверти плоскости, в которой находится эта точка.

    public String guarterCoordinates(double X, double Y){
        if (X < 0 & Y > 0) {
            return "Первая четверть";
        } else if (X > 0 & Y > 0) {
            return "Вторая четверть";
        } else if (X > 0 & Y < 0) {
            return "Третья четверть";
        } else if (X < 0 & Y < 0) {
            return "Четвёртая четверть";
        }
        return "Такой четверти не существует";
    }

    // Задача 29: Напишите программу,
    //  которая задаёт массив из 8 элементов
    //  и выводит их на экран.
    // 1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]
    // 6, 1, 33 -> [6, 1, 33]

    public int[] array(int num) {
        int[] arrays = new int[num];
         Random random = new Random();
         for (int i = 0; i < arrays.length; i++) {
             arrays[i] = random.nextInt(99);
             System.out.printf(i < arrays.length - 1 ? arrays[i] + ", " : arrays[i] + " -> ");
             }
         return arrays;
    }

    // Задача 30
    // Задача 30: Напишите программу, которая
    // выводит массив из 8 элементов, заполненный
    // нулями и единицами в случайном порядке.
    // [1,0,1,1,0,1,0,0]

    public int[] arrays(int num){
        int[] array = new int[num];
        Random random = new Random();
        for (int i = 0; i <array.length ; i++) {
            array[i] = random.nextInt(0, 2);
        }
        return array;
    }


    // Задача 31
    // 1. Задайте массив из 12 элементов,
    // 2. заполненный случайными числами из промежутка [-9, 9].
    // 3. Найдите сумму отрицательных и положительных элементов массива.
    // Например, в массиве [3,9,-8,1,0,-7,2-1,8-3,-1,6]
    // сумма положительных чисел равна 29,
    // сумма отрицательных равна -20.

    public int[] sumNumbers(int num, int negativeNum, int positiveNum){
        int[] array = new int[num];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(negativeNum, positiveNum);
        }
        return array;
    }
    public String sumPositiveAndNegative(int[] arrays){
        int sumPositiveNumbers = 0, sumNegativeNumbers = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > 0){
                sumPositiveNumbers += arrays[i];
            }else {
                sumNegativeNumbers +=arrays[i];
            }
        }
        return String.format("%s: %d\n%s: %d", "Сумма положительных чисел равна",
                sumPositiveNumbers, "Сумма отрицательных чисел равна",  sumNegativeNumbers);
    }

    // Задача 32
    //  Напишите программу замена элементов
    // массива: положительные элементы замените на
    // соответствующие отрицательные, и наоборот.
    // [-4, -8, 8, 2] -> [4, 8, -8, -2]

    public int[] arrays(int size, int min, int max){
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min,max);
        }
        return array;
    }

    public int[] replaceOfElementsArrays(int[] arr){
        int[] replArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            replArray[i] = arr[i ] * -1;
        }
        return replArray;
    }

    // Задача 33
    // 1. Задайте массив.
    // 2. Напишите программу, которая определяет элементы,
    // присутствует ли заданное число в массиве.
    // 4: массив [6,7,19,345,3]->нет
    // 3: массив [6,7,19,345,3]->да


    public int[] arr(int size){
        int[] array = new int[size];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) array[i] = rnd.nextInt(1,5);
        return array;
    }
    public String presenceNum(int[]array, int num){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) return String.format(" -> Да");
            }
        return String.format(" -> Нет");
    }

    // Задача 34
    // Задайте массив заполненный случайными положительными трёхзначными числами.
    // Напишите программу, которая покажет количество чётных чисел в массиве.

    // [345, 897, 568, 234] -> 2

    public int[] evenNumbers(int size, int min, int max){
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(min, max);
        }
        return array;
    }
    public int countEvenNum(int[]arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }


    // Задача 35.
    // Задайте одномерный массив из 123 случайных чисел.
    // Найдите количество элементов массива, значения которых лежат в
    // отрезке [10,99].
    // Пример для массива из 5, а не 123 элементов. В своём решении сделайте для
    // 123
    // [5, 18, 123, 6, 2] -> 1
    // [1, 2, 3, 6, 2] -> 0
    // [10, 11, 12, 13, 14] -> 5

    public int countNumbers(int[] array, int lineSegmentMin, int lineSegmentMax){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > lineSegmentMin && array[i] < lineSegmentMax) {
                count++;
            }
        }
        return count;
    }


    // Задача 36
    // Задайте одномерный массив,
    //  заполненный случайными числами.
    //  Найдите сумму элементов, стоящих на нечётных позициях.

    // [3, 7, 23, 12] -> 19
    // [-4, -6, 89, 6] -> 0

    public int numEvenIndex(int[] array){
        int count = 0;
        for (int i = 1; i < array.length; i += 2) {
            count += array[i];
        }
        return count;
    }

    // Задача 37
    // Найдите произведение пар чисел в одномерном массиве.
    // Парой считаем первый и последний элемент, второй и предпоследний
    // и т.д. Результат запишите в новом массиве.

    // [1 2 3 4 5] -> 5 8 3
    // [6 7 3 6] -> 36 21

    public int multiplayNum(int[] array){

        for (int i = 0; i < array.length / 2; i++) {
             int res = array[i] * array[array.length - 1 - i];
            System.out.printf(res + ", ");
        }
        return array.length % 2 == 1 ? array[array.length / 2] : (null);
    }
}