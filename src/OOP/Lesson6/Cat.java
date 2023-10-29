package OOP.Lesson6;

public class Cat {
    // Атрибуты (свойстваб поле)
   String color;
   double weight;
   String ownerName;

  // Создание параметра кота - конструктор
   public Cat(String colorName, double weightCat, String owner){
      this.color = colorName;
      this.weight = weightCat;
      this.ownerName = owner;
   }

   public void destroySofa(String sofaOwner){
       System.out.printf("Кот дерёт диван %s", sofaOwner);
   }

   @Override
   public String toString() {
      return "Cat{" +
              "color='" + color + '\'' +
              ", weight=" + weight +
              ", ownerNaime='" + ownerName + '\'' +
              '}';
   }
}
