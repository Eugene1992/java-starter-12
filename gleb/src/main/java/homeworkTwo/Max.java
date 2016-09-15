package homeworkTwo;

/**
 * Created by Gleb on 07.09.2016.
 */
public class Max {

    public static int nuberMax (int a, int b, int c){
        int max;
        if (a > b) {
            if(a > c) {
                max = a;
            }else max = c;
        }else if (b > c) {
            max = b;
        }else max = c;
        return max;
    }
}
