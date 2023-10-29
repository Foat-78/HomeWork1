package StartJava.Lesson2;

public class Primitives {
    public static void main(String[] args) {

        // Логические значения (булевы значения)
        // ИСТИНА -> true -> да -> 1;
        boolean foat = true;
        //ЛОЖЬ -> false -> нет -> 0;
        boolean petr = false;
        System.out.println(foat);
        System.out.println(petr);

        // Целые числа
        // byte - байт;
        byte maxByte = 127;
        byte minByte = -128;
        System.out.println(maxByte);
        System.out.println(minByte);

        // Short - короткое число, состоит из двух байт, или из 16 битов
        short maxSort = 32_767;
        short minSort = -32_768;
        System.out.println(maxSort);
        System.out.println(minSort);

        // Intrger - целое число, которое состоит из 4 байт, или из 32 битов
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;
        System.out.println(maxInteger);
        System.out.println(minInteger);

        //Long - целое число, котрое состоит из 8 байт или из 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;
        System.out.println(maxLong);
        System.out.println(minLong);

        // Double - число с плавающей точкой, 64 bit
        double myDouble = 1.123456789123456789;
        // Float - число с плавающей точкой, 32 bit
        float myFloat = 0.123456789f;
        System.out.println(myDouble);
        System.out.println(myFloat);

       // Char - character (символы), 16 bit
        char letter = 70; // F
        System.out.println(letter);

        char newLine = '\n'; // символ перевода строки
        System.out.print("a");
        System.out.print(newLine); // перевод строки
        System.out.print("b\n");
        char escape = '\\'; // Экранирование строки (т.е. выводится \ с новой строки).
        System.out.println(escape);

    }
}
