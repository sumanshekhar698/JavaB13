package com.java.oops.arrays.one_dimensional;

import java.util.Arrays;

public class ReverseAnArrayOptimized {
    public static void main(String[] args) {

        int[] arr = { 32, 42, 4322, 2, 4, 42, 2, 44, 9 };

        int i = 0, j = arr.length - 1;

        while (i <= j) {
            // swapping

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;

        }

        System.out.println(Arrays.toString(arr));
    }
}
