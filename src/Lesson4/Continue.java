package Lesson4;

public class Continue {
    public static void main(String[] args) {
        // Тренер дал задание спортсмену. Он бросает кости, и если выпадает
        // любое значение от 1 до 5 - то спортсмен отжимается.
        // А если выпадает 6, то спортсмен отдыхает (ничего не делает)
        int[] results = {3, 5, 6, 2, 1};
        for (int result:
             results) {
            System.out.println(result);
            if (result == 6) {
                System.out.println("Не отжимается");
                continue; // Пропускает действие при условии если = 6;
            }
            System.out.println("Спортсмен отжимается");
        }
    }
}
