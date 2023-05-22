package mainpackage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        System.out.println("Please Enter the number of rows of matrix A:");
        int rowsA = sc.nextInt();
        int[][] matrixA = new int[rowsA][rowsA];
        Operations A = new Operations(matrixA);
        Properties properties = new Properties();
        System.out.println("Please enter the value of matrix A row-wise:");
        matrixA = A.fillMatrix();
        int[][] nullMatrix = new int[rowsA][rowsA];
        properties.isPeriodic(matrixA,rowsA);
    }
}