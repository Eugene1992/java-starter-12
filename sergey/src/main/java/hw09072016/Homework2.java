package hw09072016;

import java.util.Scanner;

/**
 * Created by nixig on 9/7/2016.
 */
public class Homework2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = 10;

        int d = Math.abs(c-a);
        int e  = Math.abs(c-b);

        if (d==e){
            System.out.println("На одной волне");

        }
        if (d > e){
            System.out.println("Второе число ближе");

        }
        if (d < e) {
            System.out.println("Первое число ближе");

        }
    }
}
