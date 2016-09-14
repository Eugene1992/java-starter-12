package cw07;

public class CrossMethodCalls {
    public static void main(String[] args) {
        System.out.println(checkEquation(2, 4, 16));
    }

    static boolean checkEquation(int a, int b, int c) {
        int d = getPow(a) - 4 * a * c;
        if (d < 0) return false;
        return true;
    }

    static int getPow(int num) {
        return num * num;
    }

    static double f() {
        return 1.0;
    }
}
