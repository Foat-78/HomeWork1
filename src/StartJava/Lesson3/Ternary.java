package StartJava.Lesson3;

public class Ternary {
    public static void main(String[] args) {
        // Тернарный оператор
        // Мама отправляет сына в магазин за хлебом и дает ему 100 рублей
        // денег. Хлеб стойт 20 рублей. Мама говорит сыну: сынок если у тебя
        // после покупки хлеба останется денег 50 рублей и больше то себе можешь
        // оставить 10 рублей, но если у тебя денег останется меньше 50 рублей
        // то с этих денег ты можешь себе взять 5 рублей.



        int money = 100;
        int breadPrice = 20;
        int moneyAfterShopping = money - breadPrice; //Для старого варианта решения
        int moneyAfterShopping1 = money - breadPrice; // Для решения задачи тернарным способом
        int childMoney;

        // Старый вариант решения задачи, без тернарного оператора
        if(moneyAfterShopping >= 50){
            childMoney = 10;
            moneyAfterShopping -= 10;
        }else {
            childMoney = 5;
            moneyAfterShopping -= 5;
        }
        System.out.println(moneyAfterShopping);
        System.out.println(childMoney);
        System.out.println();

        // Вариант решения с тернарным оператором
        int childMoney1 = moneyAfterShopping1 >= 50 ? 10 : 5; // Если (moneyAfterShopping >= 50) == True то возвращаем 10 иначе 5
        moneyAfterShopping1 -= moneyAfterShopping1 >= 50 ? 10 : 5; // Сделали вычет
        System.out.println(moneyAfterShopping1);
        System.out.println(childMoney1);

    }
}
