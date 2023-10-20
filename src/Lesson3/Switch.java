package Lesson3;

public class Switch {
    public static void main(String[] args) {
        // 1 - Понедельник ... 7 - воскресенье
        int numberDay = 8;

        // Первый вариант
        switch (numberDay) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Данного дня не существует");
                break;
        }

        // Второй вариант
            switch (numberDay) {
                case 1 -> System.out.println("Понедельник");
                case 2 -> System.out.println("Вторник");
                case 7 -> System.out.println("Воскресенье");
                default -> System.out.println("Данного дня не существует");
        }
    }
}