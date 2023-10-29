package StartJava.Lesson4;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6};

        // Первый вариант
         for (int i = 0; i < numbers.length; i++) {
         System.out.println(numbers[i]);
         }

        // Второй вариант
        System.out.println();
        for (int number: numbers) {
            System.out.println(number);
        }
    }
}
