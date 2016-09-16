package cw09;

/**
 * Created by Student on 9/16/2016.
 */
public class StringTest {
    public static void main(String[] args) {
//                   0123456789
        String s1 = "Hello world!";             // literal style
        String s2 = new String("Hello world!"); // Object style
        String s3 = "Hello world" + '!' + 2 + true;
        String s4 = s1.substring(5);
        String s5 = s1.substring(5) + "!";

        String s6 = "Hello world!";
        System.out.println(s1.equals(s6));
        System.out.println(s1 == s6);

        String s7 = "hello world!";
        System.out.println(s1.compareTo(s7));
        System.out.println(s1.compareToIgnoreCase(s7));

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        char c = s1.charAt(7);
        System.out.println(c);

        System.out.println(s1.concat("!!"));
        System.out.println(s1 + "!!");

        System.out.println(s1.contains("world"));
        System.out.println(s1.contains("worlddd"));

        System.out.println(s1.replace('o', 'O'));
        System.out.println(s1.replace("world", "WORLD"));

        System.out.println(s1.startsWith("world"));
        System.out.println(s1.startsWith("Hello"));
        System.out.println(s1.startsWith("ll", 5));

        System.out.println(s1.endsWith("!"));
        System.out.println(s1.endsWith("!!"));

        String emptyString = "";
        System.out.println(emptyString.isEmpty());

        System.out.println(s1.indexOf('l'));
        System.out.println(s1.indexOf('l', 5));
        System.out.println(s1.indexOf("world"));
        System.out.println(s1.indexOf("world", 5));

        System.out.println(s1.length());

        byte[] bytes = s1.getBytes();
        for (byte aByte : bytes) {
            System.out.print(aByte + " ");
        }

        System.out.println();

        char[] chars = s1.toCharArray();
        for (char aChar : chars) {
            System.out.print(aChar + " ");
        }
        System.out.println();

        String strWithSpaces = "    hello      ";
        System.out.println(strWithSpaces);
        System.out.println(strWithSpaces.trim());
        System.out.println(strWithSpaces);

        System.out.println(s1.substring(5));
        System.out.println(s1.substring(2, 5));

        String splitString = "London is a capital of Great Britain!";
        String[] strings = splitString.split("of");
        for (String aString : strings) {
            System.out.println(aString);
        }

        String reg = "Deyneko55@gmail.com";
        System.out.println(reg.matches("[A-Z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,63}"));
    }
}
