import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Inverted Triangle With Stars
            The program that prints an inverted triangle based on the entered number.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int rowCount = scan.nextInt();
        rowCount = Math.max(rowCount, 2);
        String[] rowList = new String[rowCount];

        int charCount = (rowCount * 2) - 1;
        for (int i = 0; i < rowCount; i++)
        {
            rowList[i] = "";
            for (int j = 0; j < charCount; j++) {
                if(j < rowCount - 1) //left side of the string
                {
                    if(j - i >= 0) rowList[i] += "*";
                    else rowList[i] += " ";
                }
                else if(j == rowCount - 1) //center of the string
                {
                    rowList[i] += "*";
                }
                else //right side of the string
                {
                    if(j + i < charCount) rowList[i] += "*";
                    else rowList[i] += " ";
                }
            }
        }
        for(String row : rowList) System.out.println(row);
    }
}