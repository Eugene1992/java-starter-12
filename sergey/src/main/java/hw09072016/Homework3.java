package hw09072016;

/**
 * Created by nixig on 9/7/2016.
 */
public class Homework3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 102;
        int c = 909;

        if (a > b) {
            System.out.println("Число " + a + " самое большое");
        }

        if (a > c){
            System.out.println("Число " + a + " самое большое");

            }
        if (b > c) {
            System.out.println("Число " + b + " самое большое");

        }
        else {
            System.out.println("Число " + c + " самое большое");
        }
    }

//Есть вопрос. Kак выйти из обработчика после того как сработал первый if? например break в switch case.

}
