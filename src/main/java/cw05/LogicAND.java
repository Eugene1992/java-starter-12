package cw05;

public class LogicAND {
    public static void main(String[] args) {
        int i0 = 100;
        int i1 = 20;
        int i2 = 50;
        int i3 = 40;

 /*       if (i0 > i1) {
            if (i0 > i2) {
                System.out.println(i0);
            }
        }*/

        if (i0 > i1 && i0 > i2 && i0 > i3) {
            if (i1 > i2 && i1 > i3) {
                System.out.println(i1);
            }
            if (i2 > i1 && i2 > i3) {
                System.out.println(i2);
            }
            if (i3 > i1 && i3 > i2) {
                System.out.println(i3);
            }
        }

        if (10 > 20 && 10 / 0 == 2 & 10 != 2) {
            System.out.println("Hello");
        }
    }
}
