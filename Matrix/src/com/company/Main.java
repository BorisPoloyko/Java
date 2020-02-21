package com.company;

import com.company.matrix.Matrix;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the N: ");
        int n = com.company.datareader.DataReader.readNumber();
        int[][] array = new int [n][n];
        Matrix.initMatrix(array, n);
        Matrix.displayMatrix(array);
        Matrix.displayMatrix(Matrix.transpose(Matrix.deleteZeroRows(Matrix.transpose((Matrix.deleteZeroRows(array))))));
    }
}
