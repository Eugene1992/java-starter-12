package cw04;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("Start");
        int counter = 0;
        do {
            System.out.println(counter);
            counter++;
        } while (counter < 0);
        System.out.println("End");
    }
}
