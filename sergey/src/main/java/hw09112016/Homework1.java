package hw09112016;

/**
 * Created by nixig on 9/13/2016.
 */
//1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….

public class Homework1 {

    public static void main(String[] args) {
        myNumbers();
    }
    static void myNumbers() {
        for (int a = 1000; a < 9999; a += 3){
            System.out.println(a);
        }
    }
}
