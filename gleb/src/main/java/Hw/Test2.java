package Hw;

/**
 * Created by Gleb on 09.09.2016.
 */
public class Test2 {

    public static void main (String arg[]) {

        int a = 110;

        for (int i = 0; i < a; i++)
        {
            a -= 1;
            if (a%2 != 0)
            {
                System.out.print (a + " ");
            }
        }
    }
}
