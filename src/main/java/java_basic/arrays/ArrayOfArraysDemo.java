package java_basic.arrays;

import java.util.Arrays;

public class ArrayOfArraysDemo {

    public static void main(String[] args) {
        int[][] matrix = new int[5][];

        matrix[0] = new int[4];
        matrix[1] = new int[5];
        matrix[2] = new int[2];
        matrix[3] = new int[8];
        matrix[4] = new int[1];

        //not what I wanted, but meh
        System.out.println(Arrays.deepToString(matrix));
    }
}
