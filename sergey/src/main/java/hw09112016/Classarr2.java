package hw09112016;

/**
 * Created by nixig on 9/15/2016.
 */
public class Classarr2 {
    public static void main(String[] args) {
        int [] arr = new int [] {5,10,20,30};
        int sum = 0;
            for (int i = 0; i < arr.length; i++){
                sum = sum + arr[i];
            }
        System.out.println(sum);
    }
}
