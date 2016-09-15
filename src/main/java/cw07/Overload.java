package cw07;

public class Overload {
    public static void main(String[] args) {
        doSomething(10);
        String s = "Hello world!";
        System.out.println(s.indexOf("world", 7));
    }

    static void doSomething(int arg) {

    }

    static void doSomething(int arg, int arg2) {

    }

    static void doSomething(int arg, double arg2) {

    }

    static void doSomething(double arg) {

    }

    static void doSomething(double arg2, int arg) {

    }
}
