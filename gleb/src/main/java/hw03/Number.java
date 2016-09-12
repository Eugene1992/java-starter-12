package hw03;

import java.util.Scanner;

public class Number {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        if (a % 2 == 0) {
            System.out.print("Четное");
        } else {
            System.out.print("Не четное");
        }
    }
}
