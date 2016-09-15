package cw07;

import java.util.Scanner;

public class RandSolution {
    public static void main(String[] args) {
        check(0);
    }

    static void check(int count) {
        int rand;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some number:");
        int inputNum = scan.nextInt();
        rand = (int) (Math.random() * 5);
        System.out.println(rand);
        ++count;
        if (inputNum == rand) {
            System.out.println("Congrats! You won!");
            System.out.println("Numbers of attempts: " + count);
            return;
        } else {
            System.out.println("You are wrong, try again!");
            check(count);
        }
    }
}
