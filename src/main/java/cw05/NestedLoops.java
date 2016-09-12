package cw05;

/**
 * Created by evgeniy on 12/09/16.
 */
public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    *
//    **
//    ***
//    ****
//    *****
//    ******
//    *******
//    ********
//    *********
//    **********
}
