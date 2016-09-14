package cw07;

import java.util.Scanner;

public class RandSolution {
    public static void main(String[] args) {
        int rand;
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter some number:");
        while (true) {
            int inputNum = scan.nextInt();
            count++;
            rand = (int) (Math.random() * 10);
            System.out.println(rand);
            if (inputNum == rand) {
                System.out.println("Congrats! You won!");
                System.out.println("Numbers of attempts: " + count);
                break;
            }
            System.out.println("You are wrong, try again!");
        }
    }
}
