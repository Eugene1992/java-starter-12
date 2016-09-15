package hw09112016;

/**
 * Created by nixig on 9/15/2016.
 */
public class Classarr3 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 20, 30, 1};
        System.out.println(getMinFromArray(arr));
    }

    static int getMinFromArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}

