package sirma.Exercises.exc12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = fillTheMatrix(row, col, sc);
        printMatrix(matrix,row,col);
        System.out.println("+".repeat(30));
        rotateMatrix(matrix,row,col);
//        printMatrix(matrix,row,col);
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

    public static void printMatrix(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int[][] matrix,int rows,int col){
        int[][] rotateMatrix= new int[rows][col];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j < col; j++) {
                rotateMatrix[j][rows-1-i]=matrix[i][j];
            }
        }
        printMatrix(rotateMatrix,rows,col);
    }


}
