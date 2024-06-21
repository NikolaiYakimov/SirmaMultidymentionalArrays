package sirma.Exercises.exc4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix =fillTheMatrix(row,col,scanner);

        int sum=getResult(matrix,row,col);

        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);

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
    public static int getResult(int[][] matrix,int row,int col){
        int sum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
}
