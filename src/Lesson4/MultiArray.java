package Lesson4;

public class MultiArray {
    public static void main(String[] args) {
        // Ограбили магазин. Вор был ростом 178 см.
        // Следователь нашел две группы людей около магазина. Задача найти
        // вора по росту.

        int[] group1 = {186, 178, 198};
        int[] group2 = {165, 198, 193};
        int[][] multiArray = {group1, group2};

        upperFor: // Лейбол для завершения цикла после нахождения вора
        for (int[] array: multiArray) {
            for (int number: array) {
                if (number == 178){
                    System.out.println(number + " - > Вор");
                    break upperFor;
                }else {
                    System.out.println(number + " - > Не вор");
                }
            }
        }
    }
}
