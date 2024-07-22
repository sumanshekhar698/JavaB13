package com.java.oops.arrays.one_dimensional;

public class PassByValuePassByRef {
    public static void main(String[] args) {

        int[] arr = { 3, 5, 8, 1, 3 };// arr is a object
        int x = 100;//primitive variable

        foo(arr, x);// pass by ref, pass by value

        System.out.println(x);// 100 0 0 0
        System.out.println(arr[0]);// 3 3 100 0

    }

    static void foo(int[] arr, int x) {
        x = 0;
        arr[0] = 0;

    }
}
