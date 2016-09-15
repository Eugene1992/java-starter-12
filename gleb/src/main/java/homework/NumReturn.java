package homework;

/**
 * Created by Gleb on 13.09.2016.
 */
public class NumReturn {
    static int numReturn (int step, int min, int max){
        int sum = 0;
        for (; min < max; min += step){
            sum += min;
        }
        return sum;
    }

}
