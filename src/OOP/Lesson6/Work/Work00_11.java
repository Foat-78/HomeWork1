package OOP.Lesson6.Work;

import java.util.Random;

public class Work00_11 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int numbers = rnd.nextInt(100, 999);
        Work00 maxNum = new Work00();
        System.out.println(maxNum.maxFreeDigitNumber(numbers));
    }
}
