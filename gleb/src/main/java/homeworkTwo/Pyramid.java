package homeworkTwo;

/**
 * Created by Gleb on 12.09.2016.
 */
public class Pyramid {
    public static void pyramidStar (int a){
        for (int i = 1; i <= a; i++){
            for (int j = 0; i > j; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
