package StartJava.Lesson4;

public class WhileExample {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 100){
            System.out.println(count);
            // Необходимая конструкция для того чтобы цикл не впал в бесконечность
            count++;
        }
        System.out.println("while закончился.");
        while (true){
            count++;
            System.out.println(count);
            if (count == 1_000_000){
                break;
            }
        }
        System.out.println("while второй закончился.");
    }
}
