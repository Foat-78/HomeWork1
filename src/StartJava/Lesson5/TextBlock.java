package StartJava.Lesson5;

public class TextBlock {
    public static void main(String[] args) {
        // Форматирование строк
        // Первый вариант - не совсем читабельный
        String text = "Привет, как тебя зовут?\n" + "Меня зовут Фоат. А тебя?\n" + "Меня зовут Тимур!";
        System.out.println(text + "\n");

        // Второй вариант - хорошии, универсальный.
        String naime = "Фоат";
        String naime2 = "Эльвира";
        // Текстовый блок
        String text1 = """
                Привет, как тебя зовут?
                Меня зовут %s. А тебя как?
                Меня зовут %s!           
                """.formatted(naime, naime2);
        System.out.println(text1);
    }
}
