package cw09082016;

/**
 * Created by nixig on 9/8/2016.
 */
public class cwfor {
    public static void main(String[] args) {
        String s = "";
        for (int count = Integer.MAX_VALUE; count != 0; count /=2) {
            s = count % 2 + s;



        }
        System.out.println(s);




    }
}
