package sirma.Exercises.exc2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=Integer.parseInt(scanner.nextLine());
        int col=Integer.parseInt(scanner.nextLine());
        int[][] matrix1=new int[row][col];
        int[][] matrix2= new int[row][col];
        int[][] matrixSum=new int[row][col];

        String[] el1=scanner.nextLine().split(" ");
        int index=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix1[i][j]=Integer.parseInt(el1[index++]);
            }
        }
        String[] el2=scanner.nextLine().split(" ");
        index=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix2[i][j]=Integer.parseInt(el2[index++]);
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrixSum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrixSum[i][j]+" ");
            }
            System.out.println();
        }

    }
}
