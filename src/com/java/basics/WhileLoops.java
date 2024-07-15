package com.java.basics;

public class WhileLoops {

    public static void main(String[] args) {

        int i = 0;

        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println();
        System.out.println();


        i = 100;
        do {
            System.out.println("DO!!");
        } while (i < 10);//atleast 1 time
    }
}
