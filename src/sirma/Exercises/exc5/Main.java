package sirma.Exercises.exc5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(" ");
        int row=Integer.parseInt(input[0]);
        int col=Integer.parseInt(input[1]);

        int[][] matrix=fillTheMatrix(row,col,sc);
        int maxSum=0;
        int printRow=0;
        int printCol=0;
        for (int i = 0; i < row-1; i++) {
            for (int j = 0; j < col-1 ; j++) {
                int currSum=matrix[i][j]+matrix[i][j+1]+
                        matrix[i+1][j]+matrix[i+1][j+1];
                if(currSum> maxSum){
                    maxSum=currSum;
                    printRow=i;
                    printCol=j;
                }
            }
        }

        System.out.println(maxSum);
        System.out.println(matrix[printRow][printCol]+" "+matrix[printRow][printCol+1]);
        System.out.println(matrix[printRow+1][printCol]+" "+matrix[printRow+1][printCol+1]);



    }

    public static int[][] fillTheMatrix(int row, int col, Scanner sc) {
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            String[] elements=sc.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                matrix[i][j]=Integer.parseInt(elements[j]);
            }

        }
        return matrix;
    }
}
