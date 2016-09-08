package hw09072016;

import java.net.SocketPermission;
import java.util.Scanner;

/**
 * Created by nixig on 9/7/2016.
 */
public class Homework1 {




    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int chislo = scan.nextInt();

        if ( chislo % 2 == 0) {
            System.out.println("Опа, четное число");
        }

        else {
            System.out.println("Не четное число");

        }
    }
}
