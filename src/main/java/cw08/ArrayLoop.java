package cw08;

public class ArrayLoop {
    public static void main(String[] args) {
//                            0  1  2  3  4  5  6  7
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
