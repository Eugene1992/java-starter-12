package cw02;

public class Solution {
    public static void main(String[] args) {
        int k = 31;
        int b0, b1, b2, b3, b4, b5, b6;
        b0 = k % 2;
        k = k / 2;
        b1 = k % 2;
        k = k / 2;
        b2 = k % 2;
        k = k / 2;
        b3 = k % 2;
        k = k / 2;
        b4 = k % 2;
        k = k / 2;
        b5 = k % 2;
        System.out.print(b5 + "" + b4 + "" + b3 + "" + b2 + "" + b1 + "" + b0);
    }
}
