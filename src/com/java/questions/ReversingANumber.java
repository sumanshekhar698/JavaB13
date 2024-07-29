package com.java.questions;

public class ReversingANumber {
    public static void main(String[] args) {

        int x = 987;// 789
        // System.out.println(new StringBuilder("" + x).reverse().toString());

        int temp = 987, result = 0;


        while (temp > 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;

            System.out.println(lastDigit);

            result = result * 10 + (lastDigit);

            // 0
            // 0*10  + 7 = 7
            // 7*10 + 8 = 78
            // 78*10 + 9 = 789

        }

        System.out.println(result);
    }
}
