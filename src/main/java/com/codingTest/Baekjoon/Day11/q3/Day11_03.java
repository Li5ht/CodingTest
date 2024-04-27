package com.codingTest.Baekjoon.Day11.q3;

public class Day11_03 {
    public static void main(String[] args){
        int[][] intArray = {{1,2,3,4},{10,20,30,40},{100,200,300,400}};
        int[][] colSum = new int[4][4];
        int[][] rowSum = new int[4][4];
        int i,j;

        for (i=0; i<3; i++){
            for (j=0; j<4; j++)
                System.out.print(intArray[i][j]+"\t");
            System.out.println();
        }
        System.out.println();

        for (i=0; i<3; i++){
            for (j=0; j<4; j++){
                colSum[i][j] = intArray[i][j];
                colSum[3][j] = intArray[i][j];
            }
        }

        for (i=0; i<4; i++){
            for (j=0; j<4; j++)
                System.out.print(colSum[i][j]+"\t");
            System.out.println();
        }
        System.out.println();

        for (i=0; i<3; i++){
            for (j=0; j<4; j++){
                rowSum[i][j] = colSum[i][j];
                rowSum[i][4] = colSum[i][j];
            }
        }

        for (i=0; i<4; i++){
            for (j=0; j<4; j++)
                System.out.print(rowSum[i][j]+"\t");
            System.out.println();
        }
        System.out.println();
    }
}
