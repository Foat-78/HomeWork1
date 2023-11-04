package OOP.Lesson6.Work;

import java.util.Random;
import java.util.Scanner;

public class Work00_10 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int num = rnd.nextInt(10, 99);
        Work00 result = new Work00();
        System.out.println(result.maxRandomeNumbers(num));
    }
}
