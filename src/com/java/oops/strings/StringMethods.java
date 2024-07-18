package com.java.oops.strings;

public class StringMethods {

    public static void main(String[] args) {

        String str = "  java ";
        String str2 = str.trim();
        System.out.println(str);
        System.out.println(str2);

        str = "Java is Easy  ";
        System.out.println(str.length());
        str = str.trim();
        System.out.println(str.length());

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String splice = str.substring(5, 7);
        System.out.println(splice);

        System.out.println(str.indexOf("is"));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));

        str = str.concat("? Yes");
        System.out.println(str);

        str = str + "sss";// overlaoded operator ?
        System.out.println(str);

        System.out.println(6 + 8 * 2 + "1" + 8 + 9 + 1);
    }

}
