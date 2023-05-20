package mainpackage;

import java.util.Arrays;

public class Properties {
    Operations op = new Operations();

    void isPeriodic(int[][] matrix,int rows){
        int[][] matrixR = op.multiplyMatrix(rows, rows, rows, rows, matrix, matrix);
        for (int i = 1; i <=5; i++){
            matrixR = op.multiplyMatrix(rows,rows,rows,rows,matrix,matrixR);
            if(Arrays.deepEquals(matrixR,matrix)){
                System.out.println("Periodic: True at Period: " + i);
                return;
            }
        }
        System.out.println("Periodic: False");
    }

}