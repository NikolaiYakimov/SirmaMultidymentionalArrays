package sirma.Exercises.exc15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);

        int[][] matrix = fillTheMatrix(row, col, sc);

        String range=sc.nextLine();
        int[] start=getPositions(range.split(":")[0]);
        int[] end=getPositions(range.split(":")[1]);

        int sum=sumOfTheRange(matrix,start,end);

        System.out.println(sum);
    }
    public static int[][] fillTheMatrix(int row, int col, Scanner sc) {
        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            String[] input = sc.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        return matrix;
    }

    public static int[] getPositions(String cell){
        int row=Integer.parseInt(String.valueOf(cell.charAt(1)))-1;
        int col=cell.charAt(0)-'A';

        return new int[]{row,col};
    }
    public static int sumOfTheRange(int[][] matrix,int[] start,int[] end){
        int sum=0;

        for (int i = start[0]; i <= end[0]; i++) {
            for (int j = start[1]; j <=end[1] ; j++) {
                sum+=matrix[i][j];
            }
        }
        return sum;
    }

}
