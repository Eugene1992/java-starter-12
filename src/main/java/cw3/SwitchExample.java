package cw3;

/**
 * Created by Student on 9/7/2016.
 */
public class SwitchExample {
    public static void main(String[] args) {
        String k = "A";

        if (k.equals("A")) {
            System.out.println("A");
        }

        if (k.equals("B")) {
            System.out.println("B");
        }

        if (k.equals("C")) {
            System.out.println("C");
        }

        switch (k) {
            case "A":
                System.out.println("A");
                break;

            case "B":
                System.out.println("B");
                break;

            case "C":
                System.out.println("C");
                break;

            default:
                System.out.println("Default value");
        }
    }
}
