package com.java.oops.arrays.one_dimensional;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        int[] arr = { 32, 42, 4322, 2, 4, 42, 2, 44, 9 };
        int[] reversedArr = new int[arr.length];

        int lastIndex = arr.length - 1;

        for (int i = lastIndex, j = 0; i >= 0; i--) {
            // System.out.println(arr[i]);
            reversedArr[j++] = arr[i];
        }


        for (int i = 0; i < arr.length; i++) {
            arr[i] = reversedArr[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
