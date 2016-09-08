package cw04;

/**
 * Created by evgeniy on 08/09/16.
 */
public class WhileExample {
    public static void main(String[] args) {
        System.out.println("Start");
        int counter = 0;
        while (counter < 0) {
            counter++;
            System.out.println(counter);
        }
        System.out.println("End");
    }
}
