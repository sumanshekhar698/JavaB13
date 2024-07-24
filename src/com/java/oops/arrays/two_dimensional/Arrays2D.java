package com.java.oops.arrays.two_dimensional;

class Arrays2D {

    public static void main(String[] args) {

        int[][] matrix = new int[4][5];// 4 1D arrays each having a length of 5

        // for (int i = 0; i < matrix.length; i++) {

        // for (int j = 0; j < matrix[i].length; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();

        // }

        print2DArray(matrix);

    }

    static void print2DArray(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();

        }
    }
}
