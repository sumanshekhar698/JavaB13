package com.java.questions;

public class AdditionOfTwoBinaryStrings {
    public static void main(String[] args) {
        String str1 = "110";
        String str2 = "011";

        // 110 ---> Number ---> Decimal
        // + 011 ---> Number ---> Decimal
        // 1001

        String result = sumUpBinary(str1, str2);
        System.out.println(result);

    }

    private static String sumUpBinary(String str1, String str2) {

        int x = Integer.parseInt(str1, 2);
        int y = Integer.parseInt(str2, 2);

        int sum = x + y;
        return Integer.toBinaryString(sum);

    }
}
