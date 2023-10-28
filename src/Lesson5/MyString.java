package Lesson5;

public class MyString {
    public static void main(String[] args) {
        char symbol = 'a';
        char symbol2 = 'a';
        System.out.println(symbol == symbol2); // true

        String text = "hey";
        String text2 = "hey";
        String text3 = text;
         // Сравнение ссылок значении
        System.out.println(text == text2); // true
        System.out.println(text == text3); // true

        String text4 = new String("hey");
        String text5 = new String("hey");
        // Сравнение ссылок значении
        System.out.println(text4 == text5); //false

        // Сравнение по значению текстов методом equals();
        System.out.println(text4.equals(text5)); //true
    }
}
