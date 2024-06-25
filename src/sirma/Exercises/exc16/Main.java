package sirma.Exercises.exc16;

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
        flipBorder(matrix,row,col);
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

    public static void printMatrix(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void flipBorder(int[][] matrix, int row, int col) {
        int first = matrix[0][0];
//        int matrix

        for (int i = 1; i < col; i++) {
            int temp=matrix[0][i];
            matrix[0][i] = first;
            first=temp;
        }
        for (int i = 1; i < row ; i++) {
            int temp=matrix[i][col-1];
            matrix[i][col - 1] = first;
            first=temp;
        }
        for (int i = col - 2; i >= 0; i--) {
            int temp=matrix[row-1][i];
            matrix[row-1][i]=first;
            first=temp;
        }
        for (int i = row - 2; i >= 0; i--) {
            int temp=matrix[i][0];
            matrix[i][0]=first;
            first=temp;
        }

    }

}
