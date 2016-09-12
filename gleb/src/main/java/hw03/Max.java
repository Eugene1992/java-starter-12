package hw03;

/**
 * Created by Gleb on 07.09.2016.
 */
public class Max {

    public static void main (String[] args){

        int a = 1, b = 5, c = 3, max;

        if (a > b)
        {
            if(a > c)
            {
                max = a;

            }else max = c;

        }else if (b > c)
        {
            max = b;

        }else max = c;

        System.out.println(max);


    }

}
