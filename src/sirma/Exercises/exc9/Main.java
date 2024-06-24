package sirma.Exercises.exc9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(" ");
        int row=Integer.parseInt(input[0]);
        int col=Integer.parseInt(input[1]);

        int[][] matrix=fillTheMatrix(row,col,sc);

        int[] rowSums=findSumsOfRows(matrix,row,col);
        int[] colSums=findSumsOfCol(matrix,row,col);

        System.out.print("Row sums: ");
        for (int i = 0; i < rowSums.length; i++) {
            System.out.print(rowSums[i]);
            if(i<rowSums.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.print("Column sums: ");
        for (int i = 0; i < colSums.length; i++) {
            System.out.print(colSums[i]);
            if(i<colSums.length-1){
                System.out.print(", ");
            }
        }
    }

    public static int[][] fillTheMatrix(int row,int col, Scanner sc){
        int[][] matrix=new int[row][col];

        for (int i = 0; i < row; i++) {
            String[] input=sc.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                matrix[i][j]=Integer.parseInt(input[j]);
            }
        }
        return matrix;
    }

    public static int[] findSumsOfRows(int[][] matrix,int row,int col){
        int[] sumsArr=new int[row];

        for (int i = 0; i < row; i++) {
            int sum=0;
            for (int j = 0; j < col; j++) {
                sum+=matrix[i][j];
            }
            sumsArr[i]=sum;
        }

        return sumsArr;
    }

    public static int[] findSumsOfCol(int[][] matrix,int row,int col){
        int[] sumsArr=new int[col];

        for (int i = 0; i < col; i++) {
            int sum=0;
            for (int j = 0; j < row; j++) {
                sum+=matrix[j][i];

            }
            sumsArr[i]=sum;
        }
        return sumsArr;
    }
}
