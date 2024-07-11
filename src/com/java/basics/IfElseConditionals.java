package com.java.basics;

public class IfElseConditionals {

    public static void main(String[] args) {

        int x = 100;

        if (x % 10 == 0) {
            System.out.println(" Div by 10");
        }
        if (x % 5 == 0) {
            System.out.println(" Div by 5");
        }
        if (x % 8 == 0) {
            System.out.println(" Div by 8");
        }
        if (x % 2 == 0) {
            System.out.println(" Div by 2");
        }

        System.out.println();
        System.out.println();

        x = 97;
        // if else if else ladder
        if (x % 10 == 0) {
            System.out.println(" Div by 10");
        } else if (x % 5 == 0) {
            System.out.println(" Div by 5");
        } else if (x % 8 == 0) {
            System.out.println(" Div by 8");
        } else if (x % 2 == 0) {
            System.out.println(" Div by 2");
        } else {
            System.out.println("Else");
        }

    }

}
