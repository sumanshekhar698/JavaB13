package com.java.oops.arrays.one_dimensional;

import java.util.Arrays;

class ArraysOneD {

    public static void main(String[] args) {

        int x = 9, arr[];

        arr = new int[10];

        int evenTracker = 0;
        System.out.println(arr);


        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();





        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = evenTracker;
            evenTracker += 2;
        }



        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));


    }

}