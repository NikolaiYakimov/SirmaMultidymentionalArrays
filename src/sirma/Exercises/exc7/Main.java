package sirma.Exercises.exc7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(" ");
        int[][] matrix=fillTheMatrix(Integer.parseInt(input[0]),Integer.parseInt(input[1]),sc );

        int sum=findSumOfDiag(matrix,Integer.parseInt(input[0]));

        System.out.println(sum);
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

    public static int findSumOfDiag(int[][] matrix,int row){
        int sum=0;

        for(int i=0;i<row;i++){
            sum+=matrix[i][i];
            sum+=matrix[row-i-1][i];
        }
        return sum;
    }

}
