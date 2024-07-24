package com.java.oops.arrays.two_dimensional;

import java.util.Arrays;

public class MatrixAdditon {
    public static void main(String[] args) {//Matrix Multiplication

        int[][] mat1 = {
                { 4, 7, 2 },
                { 43, 7, 21 }
        };// 2x3

        int[][] mat2 = {
                { 94, 27, 22 },
                { 93, 75, -1 }
        };// 2x3

        if (mat1.length == mat2.length && mat1[0].length == mat2[0].length) {

            int [][] mat3 = new int[mat1.length][mat1[0].length];


            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1[0].length; j++) {
                    
                    mat3[i][j] = mat1[i][j] + mat2[i][j];
                }
            }

            Arrays2D.print2DArray(mat3);

                // System.out.println(Arrays.toString(mat3));
            // for (int[] arr : mat3) {
            //     System.out.println(Arrays.toString(arr));
            // }




        }

    }
}
