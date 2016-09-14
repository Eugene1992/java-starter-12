package homeworkTwo;

/**
 * Created by Gleb on 07.09.2016.
 */
public class Ten {
    public static void ten() {
        int a = 10;
        double n = 8.25, m = 11.25;
        double b = Math.abs(a-n);
        double c = Math.abs(a-m);
        if (c < b) {
            System.out.println(m);
        }
        if (c > b) {
            System.out.println(n);
        }
    }
}
