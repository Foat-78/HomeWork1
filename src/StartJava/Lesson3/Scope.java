package StartJava.Lesson3;

public class Scope {
    public static void main(String[] args) {

         /*
         Зоны видимости
         Переменную которую объявили внутри каких
         либо скобок, то она будет видна
         только внутри тех скобок, в которых она объявлена
         и внутри вложенных скобках!!!!
        */

        double priceCar = 10_000;

        if (priceCar > 9_000) {
            double oldPrice = priceCar;
            priceCar *= 0.95;
        }

        System.out.println(priceCar);
    }
}
