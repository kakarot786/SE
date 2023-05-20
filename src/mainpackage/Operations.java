package mainpackage;

import java.util.Scanner;

public class Operations{

    public Operations(int[][] m){
        matrix = m;
    }
    public Operations(){}

    public int[][] matrix;
    public Scanner sc = new Scanner(System.in);

    public int[][] multiplyMatrix(int rowsA, int rowsB , int columnsA, int columnsB,int[][] matrixA, int[][] matrixB){
        if(columnsA != rowsB){
            System.out.println("Multiplication not possible");
            return null;
        }
        int[][] matrixC = new int[rowsA][columnsB];
        for(int i = 0; i<matrixC.length; i++){
            for (int j = 0; j<matrixC[0].length; j++){
                for (int k = 0; k<columnsA; k++){
                    matrixC[i][j] = matrixC[i][j] + matrixA[i][k]*matrixB[k][j];
                }
            }
        }
        return matrixC;
    }

    int[][] fillMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
}