package sirma.Exercises.exc11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = fillTheMatrix(row, col, sc);

        int sumOfBoundaryEl=findBoundarySum(matrix,row,col);

        System.out.println("Sum of boundary elements: " + sumOfBoundaryEl);
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

    public static int findBoundarySum(int[][] matrix, int row, int col) {
        int sum = 0;

        for (int i = 0; i < col; i++) {
            sum+=matrix[0][i];
            if(row>1){
                sum+=matrix[row-1][i];
            }
        }

        for (int i = 1; i < row-1; i++) {
            sum+=matrix[i][0];
            if(col>1)
                sum+=matrix[i][col-1];
        }
        return sum;
    }
}
