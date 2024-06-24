package sirma.Exercises.exc8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(" ");
        int[][] matrix;
        if(input[1].equals("A")){
            matrix=patternA(Integer.parseInt(input[0]));
        }else if(input[1].equals("B")){
            matrix=patternB(Integer.parseInt(input[0]));
        }else {
            System.out.println("Wrong Pattern");
            matrix=null;
        }

        printMatrix(matrix,Integer.parseInt(input[0]));


    }

    public static int[][] patternA(int n) {
        int[][] matrix = new int[n][n];
        int val = 1;

        for (int col = 0; col < n; col++)
            for (int row = 0; row < n; row++) {
                matrix[row][col] = val++;
            }
        return matrix;
    }

    public static int[][] patternB(int n){
        int[][] matrix=new int[n][n];
        int val=1;

        for (int col = 0; col < n; col++) {
            if(col%2==0){
                for (int row = 0; row <n; row++) {
                    matrix[row][col]=val++;
                }
            }else{
                for (int row = n-1; row >=0 ; row--) {
                    matrix[row][col]=val++;
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix,int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
