package com.java.basics;

public class LoopsKeywords {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            if (i % 5 == 0) {
                continue;
            }

            System.out.print(i + " ");

        }

        System.out.println();

        for (int i = 1; i < 100; i++) {

            if (i % 5 == 0) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("END");
    }

}
