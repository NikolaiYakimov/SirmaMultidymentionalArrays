package sirma.Exercises.exc10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = fillTheMatrix(row, col, sc);

        zeroRowAndCol(matrix,row,col);

        printMatrix(matrix,row,col);


    }

    public static int[][] fillTheMatrix(int row, int col, Scanner sc) {
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            String[] input = sc.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        return matrix;
    }

    public static void zeroRowAndCol(int[][] matrix, int row, int col) {
        boolean[] zeroRow=new boolean[row];
        boolean[] zeroCol=new boolean[col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix[i][j]==0){
                    zeroCol[j]=true;
                    zeroRow[i]=true;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            if (zeroRow[i]){
                for (int j = 0; j < col; j++) {
                    matrix[i][j]=0;
                }
            }
        }

        for (int i = 0; i < col; i++) {
            if (zeroCol[i]){
                for (int j = 0; j < row; j++) {
                    matrix[j][i]=0;
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix,int row,int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
