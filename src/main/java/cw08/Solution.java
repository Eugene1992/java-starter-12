package cw08;

/**
 * Created by evgeniy on 15/09/16.
 */
public class Solution {
    public static void main(String[] args) {
//                   0  1  2   3  4
        int[] arr = {2, 5, 3, -1, 5};
//                   \______ ______/
//                          5

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        for (int i : arr) {

        }
    }
}
