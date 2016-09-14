package cw09132016;

/**
 * Created by nixig on 9/13/2016.
 */
public class Cwork1 {
    public static void main(String[] args) {
        myNumbers(5, 8);
    }

    static void myNumbers(int start, int end) {
        for (; start < end; start += 2) {
            System.out.println(start);
        }
    }

}
