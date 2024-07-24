package com.java.oops.arrays.two_dimensional;

public class Jagged2DArray {
    public static void main(String[] args) {

        int[][] jaggetMatrix0 = {

                { 32, 4, 2, 2, 3 },
                { 3, 32, 23 },
                { 3, 13, 1, 13, 1, 323, 32, 2 }

        };

        int[][] jaggedMatrix = new int[4][];

        jaggedMatrix[0] = new int[3];
        jaggedMatrix[1] = new int[5];
        jaggedMatrix[2] = new int[2];
        jaggedMatrix[3] = new int[5];

        Arrays2D.print2DArray(jaggedMatrix);

    }
}
