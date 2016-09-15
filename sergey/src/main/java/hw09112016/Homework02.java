package hw09112016;

/**
 * Created by nixig on 9/13/2016.
 */
//2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
public class Homework02 {

    public static void main(String[] args) {
        myCount();
    }
    static void myCount(){
        for (int a = 1; a < 57; a += 2){
            System.out.println(a);
        }
    }
}
