package com.java.basics;

public class ForLoops {

    public static void main(String[] args) {

        int i = 9;// SCOPE

        if (true) {
            // i ?
            int j = 8;
            // System.out.println(i);
        }

        // j?
        // System.out.println(j);

        // TOOO Even nos from 1 to 100
        for (int j = 2; j <= 100; j+=2) {// intialisation;condition;updation
            // if (j % 2 == 0) {
                System.out.println(j);
            // }

        }

        int j = Integer.MAX_VALUE;
        // Integer.MIN    0    Integer.MAX_VALUE
        for (; j > 0; j++) {//
            System.out.println(j);
        }


 
    }

}
