import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Find The Nearest Numbers
            A program that finds the number less than and closest to the entered number and
            the number greater than and closest to the entered number from the numbers in the array.
            Note: There is no exception checking.
         */

        Scanner scanner = new Scanner(System.in);
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();

        System.out.printf("""
                        Current array: %1s
                        Entered number: %2$d
                        The nearest number less than the number: %3$s
                        The nearest number greater than the number: %4$s"""
        , Arrays.toString(list), num, findTheNearestNums(list, num)[0], findTheNearestNums(list, num)[1]);
    }

    static String[] findTheNearestNums(int[] arr, int enteredNumber){

        String[] strList = new String[2];

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++)
        {
            int currentNum = arr[i];

            if(currentNum < enteredNumber)
            {
                int nextIndex = (i + 1 < arr.length) ? i + 1 : i;

                if(nextIndex == i + 1)
                {
                    if(arr[nextIndex] > enteredNumber)
                    {
                        strList[0] = Integer.toString(arr[i]);
                        if(arr[nextIndex] > enteredNumber)
                        {
                            strList[1] = Integer.toString(arr[nextIndex]);
                        }
                        else
                        {
                            strList[1] = "None.";
                        }
                        break;
                    }
                }
                else strList[0] = Integer.toString(arr[i]);
            }
            else
            {
                strList[0] = "None.";
                if(currentNum > enteredNumber)
                {
                    strList[1] = Integer.toString(currentNum);
                }
                else
                {
                    strList[1] = "None.";
                }
                break;
            }
        }

        if(strList[1] == null) strList[1] = "None";

        return strList;
    }
}