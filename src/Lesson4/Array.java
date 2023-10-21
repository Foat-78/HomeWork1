package Lesson4;

import java.util.Arrays;

// Массивы (ссылочные типы данных)
public class Array {
    public static void main(String[] args) {
        byte x = 5;
        short y = 6;
        int z = 7;
        long v = 8;

        byte c = 9;
        short d = 10;
        int b = 11;
        long n = 12;

        // Первый вариант передачи значении в массив
//        byte[] array = new byte[]{x, c};
        short[] array1 = new short[]{y, d};
        int[] array2 = new int[]{z, b};
        long[] array3 = new long[]{v, n};

        // Второй вариант передачи значении в массив
        // byte[] array = {x, c};
        // short[] array1 = {y, d};
        // int[] array2 = {z, b};
        // long[] array3 = {v, n};

//        System.out.println("1 -> " + Arrays.toString(array) + "\n");
        System.out.println("2 -> " + Arrays.toString(array1) + "\n");
        System.out.println("3 -> " + Arrays.toString(array2) + "\n");
        System.out.println("4 -> " + Arrays.toString(array3) + "\n");

        // Пример получение значения с массива по индексу
//        System.out.println(array[0]);
//        System.out.println(array[1] + "\n");

        System.out.println(array1[0]);
        System.out.println(array1[1]);

        byte[] array = {x, c};
        byte[] array13 = array;
        array13[0] = 45;
        System.out.println(Arrays.toString(array13));
        System.out.println(Arrays.toString(array));

        // Практическое задание
        // Ответить на вопрос "Столица Катара?" и записать в массив {Какого то типа}
        char[] answer = new char[]{'Д', 'o', 'x', 'a'};
        System.out.println(Arrays.toString(answer));

        String[] answer1 = new String[]{"Д", "о", "х", "а"};
        System.out.println(Arrays.toString(answer1));



    }
}
