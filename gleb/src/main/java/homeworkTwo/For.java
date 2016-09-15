package homeworkTwo;

/**
 * Created by Gleb on 08.09.2016.
 */
public class For {
    public static void forString (int number) {
         String s = "";
        for (int i = number; number != 0 ; number /= 2) {
            s = s + number%2;
        }System.out.print(s);
    }
}
