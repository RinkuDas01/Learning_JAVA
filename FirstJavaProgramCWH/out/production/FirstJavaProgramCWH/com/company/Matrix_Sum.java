package com.company;

import java.util.Scanner;

public class Matrix_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] matrix2 = {{2, 6, 13},
                {3, 7, 1}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i < matrix1.length; i++) { //row no. of times
            for (int j = 0; j < matrix1[i].length; j++) {//column no. of times
                System.out.printf("Setting value for i=%d and j=%d\n",i,j);
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        //Printing the elements of a 2D array
        for (int i = 0; i < matrix1.length; i++) { //row no. of times
            for (int j = 0; j < matrix1[i].length; j++) {//column no. of times
                System.out.print(result[i][j]+" ");
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println("");
        }

    }
}
