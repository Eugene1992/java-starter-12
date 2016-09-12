package cw05;

/**
 * Created by evgeniy on 12/09/16.
 */
public class LogicNOT {
    public static void main(String[] args) {
        boolean isTrue = false;
        int k = 0;
        while (!isTrue) {
            k++;
            if (k == 10) {
                isTrue = true;
                System.out.println("True");
            }
        }
        System.out.println(!isTrue);
    }
}
