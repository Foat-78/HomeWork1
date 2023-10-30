package OOP.Lesson6;

public class Recursion {
    public long sum(long number){
        if (number < 1) {
            return 0;
        }
        long result = number + sum(number - 1);
        return result;
    }
}
