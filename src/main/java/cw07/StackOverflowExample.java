package cw07;

public class StackOverflowExample {
    public static void main(String[] args) {
        f(0);
    }

    static void f(int n) {
        System.out.println(n);
        f(++n);
    }
}
