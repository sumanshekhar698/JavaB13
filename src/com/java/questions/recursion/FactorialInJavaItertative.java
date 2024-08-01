package com.java.questions.recursion;

import java.util.*;

// will it import all the classes under java.util ONLY
// will it import all the classes under java.util and its subpackages [WRONG]

public class FactorialInJavaItertative {

    public static void main(String[] args) {

        // fact[4] = 4 * 3 * 2 * 1 = 24
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long start = System.nanoTime();
        int result = factIterative(num);
        long end = System.nanoTime();
        System.out.println(end - start);// 5566  ns
        System.out.println(result);

        start = System.nanoTime();
        System.out.println(factRecursive(num));
        end = System.nanoTime();
        System.out.println(end - start);//42712  ns = 0.000042712 seconds

    }

    private static int factIterative(int num) {

        if (num < 0)
            return -1;// -1 means bad input

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

    private static int factRecursive(int num) {// StackOverFlow Error

        // fact[4] = 4 * 3 * 2 * 1 = 24
        // fact[4] = 4 * fact[3]

        if (num == 0) {// BASE CASE
            return 1;
        }
        return num * factRecursive(num - 1);

    }
}
