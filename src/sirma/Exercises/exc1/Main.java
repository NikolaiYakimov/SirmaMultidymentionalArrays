package sirma.Exercises.exc1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] matrix1=readMatrixFromConsole(sc);
        int[][] matrix2=readMatrixFromConsole(sc);

        System.out.println("-".repeat(20));
        System.out.println(matrix1.length);
        System.out.println("-".repeat(20));
        if (isEqual(matrix1,matrix2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }


    }

    private static int[][] readMatrixFromConsole(Scanner scanner){
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        int[][] matrix=new int[row][col];


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=scanner.nextInt();
            }
        }
        return matrix;
    }

    private static boolean isEqual(int[][] matrix1,int[][] matrix2){
        if(matrix1.length!=matrix2.length)
            return false;

        for(int i=0;i<matrix1.length;i++){
            if(matrix1[i].length!=matrix2[i].length)
                return false;
            for(int j=0;j<matrix1[i].length;j++){
                if(matrix1[i][j]!=matrix2[i][j])
                    return false;
            }
        }

        return true;
    }

}
