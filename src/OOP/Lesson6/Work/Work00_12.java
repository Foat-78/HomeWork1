package OOP.Lesson6.Work;

import java.util.Random;
import java.util.Scanner;

public class Work00_12 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rndNum = rnd.nextInt(100, 999);
        Work00 result = new Work00();
        System.out.println(result.firstAndThirdNumbers(rndNum));
    }
}
