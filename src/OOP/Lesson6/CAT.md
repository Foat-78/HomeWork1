## Объектно-ориентированное программирование
## Создание класса "кота"

1. Создаём класс Cat и описываем его свойства характерные для этого класса. 
Обстрактные - нужные нам свойства этого класса, т.е. те атрибуты которые нужны для работы!!!
Например: мне нужно описать цвет этого кота, вес и имя его владельца.
Для того что бы заполнить атрибуты кота(цвет, вес, имя хозяйна) необходимо создать конструктор 
следующим образом: набираем клавиатуру ```ALT+FN+INSERT``` и выбираем ```Constructor``` далее в окне
выбираем все поля атрибутов и нажимаем Ok.

2. После этого необходимо создать первого кота, для того чтобы это сделать 
создаём класс и назовём его Runner -> создаем нового кота ```Cat cat = new Cat();```
и выводим в терминал и получаем ссылку ```OOP.Lesson6.Cat@5f184fc6``` и это Gut!!!, потому что мы не передавали 
никаких значении, а только создавали поля ```String color;double weight;String ownerNaime;``` со значениями null.
Как это можно проверить: мы можем их перезаписать в функцию которая отвечает за
отображение созданного кота следующим образом с помощью клавиш нажать
```ALT+FN+INSERT``` и выбрать все поля далее OK -> получим конструкцию:
``` @Override
   public String toString() {
      return "Cat{" +
              "color='" + color + '\'' +
              ", weight=" + weight +
              ", ownerNaime='" + ownerNaime + '\'' +
              '}';
   }
   ```
Далее переходим в класс Runner и запустим его и получим в терминале ```Cat{color='null', weight=0.0, ownerNaime='null'}```,
почему так? Потому что мы не инициализировали свойства кота

## Инициализация свойств "кота"

1. Для того чтобы кот имел цвет, вес и имя хозяйна т.е. инициализировать кота (присвоение значении переменным или атрибутам)
нам необходимо создать конструктор. Для этого я должен написать в классе Cat
 public Cat() - это просто создание нового объекта и в круглых скобках я должен указать перечень значении
```(String colorName, double weightCat, String owner)``` 
которые я собираюсь передавать (цвет кота, вес и имя) следующим образом:
```
public Cat(String colorName, double weightCat, String owner){
      this.color = colorName;
      this.weight = weightCat;
      this.ownerName = owner;
   }
```
```
где, 
this. - данный объект color присваеваем значение colorName;
Например:
this.color = colorName;
```
Далее мы должны в классе Runner значение кота в круглых скобках 
```Cat cat = new Cat("White", 3.5, "Timur");``` -> 
если мы запустим в классе Runner то в терминале мы получим кота со значениями 
```Cat{color='White', weight=3.5, ownerNaime='Timur'}```

## Атрибуты и как с ними работать напрямую

1. Когда создавали нового кота мы передавали его свойства - цвет, вес и имя хозяйна.
И теперь нам нужно взять и обратиться напрямую к цвету и остальные свойства нам не нужны
и как это реализовать в классе Runner. Например, если нам нужен цвет, то мы пишем:
```
System.out.println(cat.color);
и получаем в терминале -> White
```
И далее помимо того что я могу выводить отдельные свойства кота, я могу так же их 
присваивать нове значение коту в классе Runner следующим образом:
```
// Присваеваем цвет вместо белого - красный
cat.color ="Red"; 
// Выводим
System.out.println(cat.color);
// Получаем в терминале
Red
```
## Класс и экземпляры класса

* `Класс` - Описывает набор свойств и действии типов объекта
  (на примере кота: цвет, вес, имя хозяина - обстактные значения).
* `Экземпляр класса` - Хранит значения свойств конкретного объекта
  (на примере кота: белый, 3 кг., Тимур)

## Методы

`Метод` - это функция экземпляра класса
Например мы создаём нового кота в классе Runner `Cat cat = new Cat("White", 3.5, "Timur");`
и у него есть метод (т. е. что умеют коты - драть диван) -> мы создаём метод `destroySofa` в классе 
`Cat` и передаём в метод хозяйна дивана `String sofaOwner`. Например:
```
  public void destroySofa(String sofaOwner){
       System.out.printf("Кот дерёт диван %s", sofaOwner);
   }

```
Тип метола будет void - который ничего не возвращает (Если метод с типом void то значение 
полученное нельзя сохранит в переменную!!!). Далее в классе `Cat` пишем конструкцию ` cat.destroySofa("Тимура!!!");`
и в терминале получим `Кот дерёт диван Тимура`

## Ключевое слово return


