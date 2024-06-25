package sirma.Exercises.exc13;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String colName=sc.nextLine();
        int colNum=convertColumnExcelToNum(colName);
        System.out.println(colNum);

    }

    public static int convertColumnExcelToNum(String excelColumn){
        int colValue=0;

        for (int i = 0; i < excelColumn.length(); i++) {
            int curValue=excelColumn.charAt(i)-'A'+1;
            colValue=colValue*26+curValue;
        }
        return colValue;
    }
}
