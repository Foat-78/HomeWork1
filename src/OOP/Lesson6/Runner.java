package OOP.Lesson6;

public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("White", 3.5, "Timur");
        System.out.println(cat); // Cat{color='White', weight=3.5, ownerNaime='Timur'}
        System.out.println(cat.color);// White
        cat.color ="Red";
        System.out.println(cat.color);// Red

        cat.destroySofa("Тимура!!!"); //Кот дерёт диван Тимура!!!
    }
}
