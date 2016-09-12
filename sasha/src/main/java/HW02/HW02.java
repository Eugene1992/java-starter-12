package HW02;

import java.util.Scanner;

public class HW02 {
    /**
     * Задание 2
     * Создать программу, проверяющую и сообщающую на экран, является ли введенное с
     * консоли целое число, чётным либо нечётны.
     */
    /**public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int a = scan.nextInt();
     if (a % 2 == 0) {
     System.out.println("Число " + a + "- Четное");
     } else {
     System.out.println("Число " + a + "- Нечетное");
     }
     }
     }*/
/**
 * Задание 3
 * Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
 * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.public static  void main(String[] args){
 * Scanner scan = new Scanner(System.in);
 * int n = scan.nextInt();
 * int m = scan.nextInt();
 * int a = 10;
 * int b = Math.abs(a-n);
 * int c = Math.abs(a-m);
 * if(b==c){
 * System.out.println("Числа "+n+" и "+m + " равноудалены от "+c);
 * }
 * if(b>c){
 * System.out.println("Число "+m+" ближе к "+a);
 * }
 * if (b<c) {
 * System.out.println("Число "+n+" ближе к "+a);
 * }
 * }
 * <p>
 * }
 * Задание 4
 * Задано три переменных, найти и вывести на экран переменную с максимальным значением
 * (значения всех переменных разные).
 * public static void main(String[] args) {
 * int a = 900;
 * int b = 80;
 * int c = 2300;
 * if (a > b) {
 * if (a > c) {
 * System.out.println("Larger is a");
 * } else {
 * if (b > c) {
 * System.out.println("Larger is b");
 * } else {
 * System.out.println("Larger is c");
 * }
 * }
 * }else{
 * if (c > b) {
 * System.out.println("Larger is c");
 * }
 * }
 * }
 * }
 */
/**public static  void main(String[] args){
 Scanner scan = new Scanner(System.in);
 int n = scan.nextInt();
 int m = scan.nextInt();
 int a = 10;
 int b = Math.abs(a-n);
 int c = Math.abs(a-m);
 if(b==c){
 System.out.println("Числа "+n+" и "+m + " равноудалены от "+c);
 }
 if(b>c){
 System.out.println("Число "+m+" ближе к "+a);
 }
 if (b<c) {
 System.out.println("Число "+n+" ближе к "+a);
 }
 }

 }**/
/**
 * Задание 4
 * Задано три переменных, найти и вывести на экран переменную с максимальным значением
 * (значения всех переменных разные).
 */

    /**
     * public static void main(String[] args) {
     * int a = 900;
     * int b = 80;
     * int c = 2300;
     * if (a > b) {
     * if (a > c) {
     * System.out.println("Larger is a");
     * } else {
     * if (b > c) {
     * System.out.println("Larger is b");
     * } else {
     * System.out.println("Larger is c");
     * }
     * }
     * }else{
     * if (c > b) {
     * System.out.println("Larger is c");
     * }
     * }
     * }
     * }
     */
    /**Задание 5
    Задано четыре переменных, найти и вывести на экран вторую по величине.*/
    public static void main(String[] args) {
        int a = 125;
        int b = 94;
        int c = 212;
        int d = 87;
        if(a>b);{
            if(b>c){
                if(c>d);{

                }
            }else{
                System.out.println("Среднее число");
            }
        }
        }




    }





