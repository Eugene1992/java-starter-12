package cw06;

/**
 * Created by evgeniy on 13/09/16.
 */
public class Test {
    public static void main(String[] args) {
        printNtimes("Hello world", 4);
        printNtimes("Hello!", 3);
        double sum = getSum(10, 20);
        System.out.println(sum);
        assert sum == 20;
    }

    static void printNtimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    static int getSum(int argOne, int argTwo) {
        return argOne + argTwo;
    }
}
