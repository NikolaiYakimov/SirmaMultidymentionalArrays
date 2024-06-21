package sirma.Exercises.exc3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        int row=Integer.parseInt(input[0]);
        int col=Integer.parseInt(input[1]);

        char[][] matrix1=new char[row][col];
        char[][] matrix2=new char[row][col];
        char[][] resultMatrix=new char[row][col];

        matrix1=fillTheMatrix(row,col);
        matrix2=fillTheMatrix(row,col);

        resultMatrix=fillTheResultMatrix(matrix1,matrix2,row,col);
        printMatrix(resultMatrix,row,col);


    }
    public static char[][] fillTheMatrix(int row,int col){
        Scanner sc=new Scanner(System.in);
        char[][] matrix=new char[row][col];
        String[] charArr=sc.nextLine().split(" ");
        int index=0;
        for(int i =0;i<row;i++){
            for (int j = 0; j < col; j++) {
                matrix[i][j]=charArr[index++].charAt(0);
            }
        }
        return matrix;
    }
    public static char[][] fillTheResultMatrix(char[][] matrix1,char[][] matrix2,int row,int col){
            char[][] resultMatrix=new char[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix1[i][j]==matrix2[i][j]){
                    resultMatrix[i][j]=matrix1[i][j];
                }else
                    resultMatrix[i][j]='*';
            }

        }
        return resultMatrix;
    }
    public static void printMatrix(char[][] matrix,int row,int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
