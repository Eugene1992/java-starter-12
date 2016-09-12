package cw05;

/**
 * Created by evgeniy on 12/09/16.
 */
public class LeftShift {
    public static void main(String[] args) {
        short k = 12;
        /*
            0000 0000 0000 1100
        << 2
            0000 0000 0011 0000
        */
        System.out.println(k << 2);
    }
}
