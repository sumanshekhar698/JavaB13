package com.java.basics;

public class Conditionals {

    public static void main(String[] args) {

        int x = 100;

        // == is comparison operator
        // !=
        // > >=
        // < <=

        System.out.println(x % 2 == 0);

        // if (x >= 0) {
        // if (x % 2 == 0) {// == is comparison operator
        // System.out.println("Even");
        // } else {
        // System.out.println("ODD");
        // }
        // }

        // x= -8;
        // && logical and operator
        if ((x >= 0) && (x % 2 == 0)) {// == is comparison operator
            System.out.println("Even");
        } else {
            System.out.println("Not even");
        }

        x = -8;
        if ((x >= 0) || (x % 2 == 0)) {// == is comparison operator
            System.out.println("If");
        } else {
            System.out.println("Else");
        }




    }

}
