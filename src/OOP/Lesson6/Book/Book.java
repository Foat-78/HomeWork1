package OOP.Lesson6.Book;
// Создать класс книга с атрибутами: имя книги, имя автора, количество страниц, документальный (Да/Нет)
// Метод класса книга:
//1. Вывод общего количества строк в книге - без аргументов:
//Результат: Выводит на экран количество страниц * 40
//2. Вывод общего количества строк в книге (количество строк в странице).
//Результат: Выводит на экран количество страниц * количество строк в странице
//3. Вывод информации о книге без аргументов
//Результат: [Имя книги] от [Имя автора] - [документальная/недокументальная]
public class Book {
    String name;
    String autor;
    int pages;
    boolean isNonFiction;

    public Book(String name, String autor, int pages, boolean isNonFiction) {
        this.name = name;
        this.autor = autor;
        this.pages = pages;
        this.isNonFiction = isNonFiction;
    }
    public void printCountRows(){
        System.out.println("Количество строк в книге: " + this.pages * 40);
    }

    public void printCountRows(int countRowsOnPage){
        System.out.println("Количество строк в книге: " + this.pages * countRowsOnPage);
    }

    public void printInfo(){
        System.out.printf("%s от %s - %s\n", this.name, this.autor, this.isNonFiction ?
                "Документальная" : "Не документальная");
        printCountRows();
    }
}
