package com.company;
import java.math.BigInteger;
import java.util.Arrays;


final class PascalTriangle {
    private final int n;
    private BigInteger[][] matrix;


    public PascalTriangle(int n){
        if(n < 0){
            n = 0;
        }
        this.n = n;
        generatePascalsTriangle();
    }

    public BigInteger[][] getPascalsMatrix(){
        return matrix;
    }


    private void generatePascalsTriangle(){
        matrix = new BigInteger[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = (j <= i ? BigInteger.ONE : BigInteger.ZERO);
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 1; j <= i; ++j) {
                matrix[i][j] = (matrix[i - 1][j - 1]).add(matrix[i - 1][j]);
            }
        }
    }
}

