package cw07;

public class Recursion {
    public static void main(String[] args) {
        fib(5);
    }

    static int fact(int num) {
        if (num < 1) return 1;
        return num * fact(num - 1);
    }

    static int fib(int num) {
        // System.out.print(num + " ");
        if (num < 2) return num;
        // System.out.print(num + " ");
        return fib(num - 2) + fib(num - 1);
    }
}
