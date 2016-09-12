package cw05;

/**
 * Created by evgeniy on 12/09/16.
 */
public class NestedLoops {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("# ");
                Thread.sleep(1000);
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
