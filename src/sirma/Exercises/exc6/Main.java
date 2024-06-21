package sirma.Exercises.exc6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int[][] matrix=fillTheMatrix(n,sc);

        getTheDiagonal(matrix,n);


    }

    public static int[][] fillTheMatrix(int n,Scanner sc){
        int[][] matrix=new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] input=sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                matrix[i][j]=Integer.parseInt(input[j]);
            }
        }
        return matrix;
    }

    public static void getTheDiagonal(int[][] matrix, int n){
        int[] diag1=new int[n];
        int[] diag2=new int[n];
        for (int i = 0; i < n; i++) {
            diag1[i]=matrix[i][i];
            diag2[i]=matrix[n-i-1][i];
        }

        printArr(diag1);
        printArr(diag2);
    }

    public static  void printArr(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
