import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Diamond With Stars
            The program that prints the diamond shape on the screen according to the entered number.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        number = Math.max(number, 2);
        int rowCount = (number * 2) - 1;
        String[] rowList = new String[rowCount];

        int midRowIndex = number - 1;
        for (int i = 0; i < rowCount; i++)
        {
            rowList[i] = "";

            for (int j = 0; j < rowCount; j++) {

                if(i <= midRowIndex)
                {
                    if((j < (midRowIndex - i) || j > (midRowIndex + i)))
                    {
                        rowList[i] += " ";
                    }
                    else rowList[i] += "*";
                }
                else {
                    rowList[i] = rowList[(2 * midRowIndex) - i];
                }
            }
        }

        for(String row : rowList) System.out.println(row);
    }
}