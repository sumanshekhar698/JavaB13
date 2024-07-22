package com.java.oops.arrays.one_dimensional;

import java.util.Arrays;

public class UtilityclassOfArray {
    public static void main(String[] args) {

        int[] arr = { 23, 43, 3, 54, 54, 4, 644 };

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);// Ascending
        System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr);// Ascending and Reverse ==> Descending

        Arrays.fill(arr, 9);
        System.out.println(Arrays.toString(arr));

        Arrays.fill(arr, 2, arr.length, 2);
        System.out.println(Arrays.toString(arr));

    }
}
