package com.java.questions.recursion;

/**
 * Main
 */
public class Main {

    static int counter = 0;

    public static void main(String[] args) {

        dummy();
        System.out.println(counter);
    }

    static void dummy() {// recursion is a programnming technique where a fn calls itself

        // Base Condition/Case
        if (counter == 25000)// controlled recursion
            return;

        System.out.println("Hey ");
        ++counter;
        dummy();

    }
}