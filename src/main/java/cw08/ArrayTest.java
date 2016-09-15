package cw08;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr1 = new int[]{10, 20, 30};
        int[] arr2 = {10, 20, 30};

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[2] = 40;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr.length);
    }
}
