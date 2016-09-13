package Hw2;

/**
 * Created by Gleb on 13.09.2016.
 */
public class Test {

    public static void main (String [] arg){
        numReturn (2, 10, 30);
    }
    static void numReturn (int step, int min, int max){
        for (int i = 0; min < i; i += step){
            if (i < max){
                i += i;
            } System.out.println(i);

        }
    }
}
