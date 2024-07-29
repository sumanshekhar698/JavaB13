package com.java.questions;

public class FindIfANumberIsPrime {
    public static void main(String[] args) {
        int x = 97;
        boolean result = isPrime(x);
        System.out.println(result);

        int start = 100, end = 1000000;
        printPrimeInRange(start, end);// Sieve Of Erathosenes
    }

    private static void printPrimeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

        }

    }

    private static boolean isPrime(int x) {

        if (x <= 1) {
            return false;
        }

        // 3
        // 12 :: 1,2,3, 4,6,12

        for (int i = 2; i * i <= x; i++) {// sqrt 95
            if (x % i == 0) {
                return false;
            }

        }

        return true;
    }
}
