package com.java.oops.arrays.one_dimensional;

import java.util.Arrays;

public class StringArgs {

    // public static void main(String suman[]) {

        public static void main(String ... suman) {

        // String[] mat = { "Hey", "Hi" };

        System.out.println(suman.length);
        System.out.println(Arrays.toString(suman));
        foo(4, 8, 42, 4, 2, 2, 2);

        // Jane Doe
        // John Doe
        // foo
        // bar

        String str = "How High Are you ?";
        String arr [] = str.split(" ");// john@gmail.com
        System.out.println(Arrays.toString(arr));


    }

    // static void foo(int x, int y) {
    // System.out.println(x + " " + y);

    // }

    static void foo(int... varARgs) {
        System.out.println(varARgs);
        System.out.println(Arrays.toString(varARgs));

    }

}
