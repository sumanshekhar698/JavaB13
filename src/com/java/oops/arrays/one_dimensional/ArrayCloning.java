package com.java.oops.arrays.one_dimensional;

import java.util.Arrays;

public class ArrayCloning {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 2, 5 };

        int[] arr2 = arr;// Not a Cloning, passing a ref

        // Arrays.fill(arr2, -1);
        // System.out.println(Arrays.toString(arr));

        // TODO Manual Cloning
        // create a new array of same size
        // copy the element for the old array to the new one

        int[] arr3 = arr.clone();// Its only fo 1D array
        Arrays.fill(arr3, -1);
        System.out.println(Arrays.toString(arr));

    }//2D arrays
}
