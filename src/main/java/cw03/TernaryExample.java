package cw03;

/**
 * Created by Student on 9/7/2016.
 */
public class TernaryExample {
    public static void main(String[] args) {
        int a = 7;
        int b;

        if (a > 5) {
            if (a == 7) {
                b = 100;
            } else {
                b = 1000;
            }
        } else {
            b = 0;
        }

        b = a < 5 ? a == 7 ? 100 : 1000 : 0; // b = condition ? if true : if false;

        System.out.println(b);
    }
}
