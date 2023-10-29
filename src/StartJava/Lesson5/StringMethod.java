package StartJava.Lesson5;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        String text = "Khisamov Foat!";

        // Перевод в верхний регистр
        String upperCase = text.toUpperCase();
        System.out.println(upperCase);

        // Перевод в нижний регистр
        String lowerCase = text.toLowerCase();
        System.out.println(lowerCase);

        // Длина строки
        int length = text.length();
        System.out.println(length);

        // Есть ли в тексте - Khisamov Foat, текст - Foat текст?
        boolean contains = text.contains("Foat");
        System.out.println(contains); // true
        boolean contains1 = text.contains("foat");
        System.out.println(contains1); // false потому что слово - foat в нижнем регистре

        // Замена всех куска текста (подстроки) на другой текст
        String s = text.replaceAll("Foat", "Timur");
        System.out.println(s); // Khisamov Timur!

        // Повторить текст n раз
        String repeat = text.repeat(10);
        System.out.println(repeat);

        // Разбить текст на массив String
        String names = "Foat;Timur;Elia;Toma";
        String[] split = names.split(";");
        System.out.println(Arrays.toString(split)); // [Foat, Timur, Elia, Toma]

        // Объединение строк (конкатенация)
        String names1 = "Timur";
        String numes1 = " Khisamov";
        String result = names1 + numes1;
        System.out.println(result); // Timur Khisamov

        // Начинается на подстроку
        boolean startsWith = text.startsWith("Khis");
        System.out.println(startsWith); // true

        // Заканчивается на подстроку
        boolean endsWith = text.endsWith("at!");
        System.out.println(endsWith); // true

        // Обрезка строки (Первые 5 символов)
        String substring = text.substring(0, 5);
        System.out.println(substring); // Khisa

        // Комбинированный способ т.е.
        // исспользование несколько методов в одной строке
        String s1 = "Foat".toUpperCase().replaceAll("AT", "ur");
        System.out.println(s1); // FOur
    }
}
