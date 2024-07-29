package com.java.questions;

public class Playground {
    public static void main(String[] args) {

        String str1 = "89876";
        String str2 = "8976";/// String ---> Number ----> Sum up --> Print value Decimal

        int x = Integer.parseInt(str1);// By default the radix/base is 10
        int y = Integer.parseInt(str2, 10);
        System.out.println(x + y);

    }
}
