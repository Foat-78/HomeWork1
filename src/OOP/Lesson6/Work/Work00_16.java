package OOP.Lesson6.Work;

import java.util.Random;

public class Work00_16 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(1, 10);
        Work00 day = new Work00();
        System.out.println(day.DayOffOfTheWeek(num));
    }
}
