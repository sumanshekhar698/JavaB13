package com.java.oops.strings;

import java.lang.StringBuilder;

public class StringBuilderExamples {
    public static void main(String[] args) {


        // StringBuffer sbuf = new StringBuffer("Hey");//String Buffer is preferred for Thread Saftey

        StringBuilder sb = new StringBuilder("Hey");
        sb.append(" ! How");
        sb.append(" are u ??");
        System.out.println(sb);

        sb.reverse();// file Handling
        sb.length();
        sb.charAt(1);
        sb.isEmpty();

        StringBuilder sb1 = new StringBuilder("Hey");
        String str1 = "hey";

        if (sb1.toString().equalsIgnoreCase(str1)) {
            System.out.println("TRUE");
        }

        //

    }
}
