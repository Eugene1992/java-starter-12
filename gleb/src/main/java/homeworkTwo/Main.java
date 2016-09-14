package homeworkTwo;

import static homeworkTwo.For.forString;
import static homeworkTwo.Max.nuberMax;
import static homeworkTwo.Number.number;
import static homeworkTwo.Pyramid.pyramidStar;
import static homeworkTwo.Ten.ten;

/**
 * Created by Gleb on 13.09.2016.
 */
public class Main {
    public static void main (String [] arg){
        forString(36);
             System.out.println();
        System.out.print(nuberMax (5, 3, 6));
             System.out.println();
        number (5);
             System.out.println();
        pyramidStar (4);
             System.out.println();
        ten ();
    }
}
