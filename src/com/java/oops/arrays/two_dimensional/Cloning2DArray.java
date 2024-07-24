package com.java.oops.arrays.two_dimensional;

public class Cloning2DArray {
    public static void main(String[] args) {

        int[][] mat1 = {
                { 4, 7, 2 },
                { 43, 7, 21 }
        };// 2x3

        // 1st way
        // Create a new 2D array with same dimensions
        // Copy all the elements one by one

        // int[][] mat2 = mat1.clone();
        // mat2[0][0] = -1;
        // Arrays2D.print2DArray(mat1);

        int[][] mat2 = new int[mat1.length][];

        for (int i = 0; i < mat1.length; i++) {
            mat2[i] = mat1[i].clone();
        }

        mat2[0][0] = -1;
        Arrays2D.print2DArray(mat1);

    }
}
