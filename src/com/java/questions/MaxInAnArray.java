package com.java.questions;

public class MaxInAnArray {
    public static void main(String[] args) {

        //TODO Find Min in an Array
        //TODO Find 2nd Max in an array
        int[] arr = { 32, 433, 43, 32, 2, 2, 32, 3, 2, 22, 43, 23, 2, 4, 424, 432, 433, 43 };

        // int arr [] = {};

        // int max = arr[0];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // max = Integer.max(max, arr[i]);
            if (arr[i] > max) {
                max = arr[i];
            }

        }

        System.out.println(max);
    }
}
