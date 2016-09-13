package Hw2;

/**
 * Created by Gleb on 13.09.2016.
 */
public class Test {

    public static void main (String [] arg){
        numReturn (2, 10, 30);
    }
    static void numReturn (int step, int min, int max){
        for (int i = min; min < max; min += step){
                min += min;
        }System.out.println(min);
    }
}
