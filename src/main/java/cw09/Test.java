package cw09;

import java.util.Arrays;

/**
 * Created by Student on 9/16/2016.
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{2, -4, 6, 12, -23, 1};
        changeMinAndMax(arr);
        System.out.println(Arrays.toString(arr));
        printPairNumbers(arr);
        printArrayHalfs(arr);
        System.out.println();
        printArrayHalfsDesc(arr);
        System.out.println();
        System.out.println(getArrayAverage(arr));
        changeZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 1. Вывести в консоль все парные числа одномерного массива
     * @param nums input array
     */
    static void printPairNumbers(int[] nums) {
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    /**
     * 3. Вывести первую и вторую половину одномерного массива
     * @param arr input array
     */
    static void printArrayHalfs(int[] arr) {
        System.out.print("First half: ");
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Second half: ");
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
//    int[] arr = new int[]{2, -4, 6, 12, -23, 1, 7, 9, -12};
//                          \______________________________/
//                                        length
//                          \_______________/\_____________/
//                          0           length / 2    length
    /**
     * 4. Вывести первую и вторую половину одномерного массива в обратном порядке
     */
    static void printArrayHalfsDesc(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= arr.length / 2 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * Найти среднеарифметическое всех чисел массива
     * @param arr input arr
     * @return arr average
     */
    static int getArrayAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    /**
     * 8. Заменить все отрицательные числа в массиве на 0
     */
    static void changeZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        /*for (int i : arr) {
            if (i < 0) {
                i = 0;
            }
        }*/
    }

    /**
     * 10. Поменять минимальное и максимальное числа в массиве местами
     * @param arr - input arr
     */
    static void changeMinAndMax(int[] arr) {
        int minInd = 0;
        int maxInd = 0;
        int min = arr[0];
        int max = arr[0];
        int buf;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                maxInd = i;
                max = arr[i];
            }
            if (arr[i] < min) {
                minInd = i;
                min = arr[i];
            }
        }
        buf = arr[minInd];
        arr[minInd] = arr[maxInd];
        arr[maxInd] = buf;
    }
}
