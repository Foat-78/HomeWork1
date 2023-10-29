package StartJava.Lesson4;
// Принципиальное отличие заключается тем, что
// в начале конструкция do выполняется, а после
// осуществляется проверка while
public class DoWhile {
    public static void main(String[] args) {
        int count = 0;
        do {
            System.out.println(count);
            count++;
        } while (count <= 100);
    }
}
