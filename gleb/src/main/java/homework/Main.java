package homework;

import static homework.Notchetnoe.notChetnoe;
import static homework.NumReturn.numReturn;
import static homework.Otnymanye.numberOtnymanye;
import static homework.Thousands.thousandsNumbe;
import static homework.Ticket.luckyTicet;
import static homework.Umnozhenye.numbeUmnozhenye;

/**
 * Created by Gleb on 13.09.2016.
 */
public class Main {

    public static void main (String [] arg){
        thousandsNumbe (1000);
           System.out.println();
        notChetnoe (1);
           System.out.println();
        numberOtnymanye ();
           System.out.println();
        numbeUmnozhenye (1);
           System.out.println();
        luckyTicet ();
           System.out.println();
        System.out.print(numReturn (2, 5, 10));
    }

}
