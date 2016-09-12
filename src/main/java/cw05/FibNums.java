package cw05;

/**
 * Created by evgeniy on 12/09/16.
 */
public class FibNums {
    public static void main(String[] args) {
        int f0 = 0, f1 = 1;
        int cur;
        System.out.print(f0 + " " + f1 + " ");
        for (int i = 0; i < 20; i++) {
            cur = f0 + f1;
            System.out.print(cur + " ");
            f0 = f1;
            f1 = cur;
        }
    }
}
