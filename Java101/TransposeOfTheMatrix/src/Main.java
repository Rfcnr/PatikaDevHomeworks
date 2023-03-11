import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Transpose Of The Matrix
            A program that prints the transpose of the entered two-dimensional array.
            Note: There is no exception checking.
         */

        int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9}, {10, 11, 12} };

        System.out.println(transpose(matrix));
    }

    static String transpose(int[][] arr)
    {
        StringBuilder resultStr = new StringBuilder("Matrix;\n");

        for (int[] rowArr : arr)
        {
            resultStr.append(Arrays.toString(rowArr)).append("\n");
        }

        int tColCount = arr.length;
        int tRowCount = arr[0].length;

        int[][] matrixT = new int[tRowCount][tColCount];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                matrixT[j][i] = arr[i][j];
            }
        }

        resultStr.append("Transpose;\n");
        for (int[] rowArr : matrixT)
        {
            resultStr.append(Arrays.toString(rowArr)).append("\n");
        }

        return resultStr.toString();
    }
}