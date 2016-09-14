package homework;

/**
 * Created by Gleb on 13.09.2016.
 */
public class Ticket {
    public static void luckyTicet (){
        int a, b, c, d, f, r, w, e, sum = 0;
        for (int i = 100000; i <= 999999; i++){
            a = i / 100000;
            b = (i / 10000) - (a * 10);
            c = (i / 1000) - (a * 100) - (b * 10);
            d = (i / 100) - (a * 1000) - (b * 100) - (c * 10);
            f = (i / 10) - (a * 10000) - (b * 1000) - (c * 100) - (d * 10);
            r = i - (a * 100000) - (b * 10000) - (c * 1000) - (d * 100) - (f * 10);
            w = a + b + c;
            e = d + f + r;
            if (w == e){
               sum += 1;
            }
        }System.out.println(sum);
    }
}
