package sirma.Exercises.exc2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] matrixSum = new int[row][col];

        enterMatrix(row, col, matrix1, scanner);

        enterMatrix(row, col, matrix2, scanner);

        matrixSum=getMaxMatrix(matrix1,matrix2,row,col);

        printMatrix(matrixSum, row, col);

    }

    public static void enterMatrix(int row, int col, int[][] matrix, Scanner sc) {
        String[] el1 = sc.nextLine().split(" ");
        int index = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(el1[index++]);
            }
        }
    }

    public static void printMatrix(int[][] matrix, int row, int col) {

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getMaxMatrix(int[][] matrix1, int[][] matrix2, int row, int col) {
        int[][] resultMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return resultMatrix;
    }


}
