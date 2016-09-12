package cw05;

/**
 * Created by evgeniy on 12/09/16.
 */
public class Main {
    public int getSum(int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += i;
        }
        return sum;
    }


}
