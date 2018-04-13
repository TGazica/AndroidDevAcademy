package org.tomislavgazica.assignment9;

import java.io.IOException;
import java.util.Random;

public class Assignment9 {

    public static char[] setRow(int matrixLength) {

        char[] newRow = new char[matrixLength];
        Random random = new Random();

        for (int i = 0; i < matrixLength; i++) {

            if (random.nextInt(3) != 1) {
                newRow[i] = (char) (random.nextInt(125-33) +33);

            } else {
                newRow[i] = ' ';
            }
        }
        return newRow;
    }

    public static char[][] copyMatrix(char[][] matrix) {

        char[] row;
        int i=matrix.length-1;

        row = setRow(matrix[0].length);

        for (int j = matrix[0].length - 1; j > 0; j--) {
            System.arraycopy(matrix[i - 1], 0, matrix[i], 0, matrix[i].length);
        }

        System.arraycopy(row, 0, matrix[0], 0, matrix[0].length);

        return matrix;
    }

    public static void print(char[][] matrix) throws InterruptedException {
        for (int i = 0; i < matrix.length; i++) {
            Thread.sleep(100);

            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static char[][] setFirstMatrix(char[][] matrix){
        for (int i = 0; i<matrix.length;i++){
            for (int j=0; j< matrix[0].length; j++){
                matrix[i][j]=' ';
            }
        }
        return matrix;
    }

    public static void main(String[] args) throws InterruptedException, IOException {

        char[][] matrix = new char[2][150];
        matrix=setFirstMatrix(matrix);

        matrix=copyMatrix(matrix);
        while (true) {
            matrix = copyMatrix(matrix);
            print(matrix);
            Thread.sleep(100);
            Runtime.getRuntime().exec("clear");
        }
    }
}
