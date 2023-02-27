import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Recursive Method According To The Pattern
            Program with a recursive method that works according to a given pattern.
            Pattern:
            * Subtract 5 from the entered number until the entered number is 0 or negative.
            * After the number becomes negative or 0, add 5 until the number is equal to its initial value.
            * At each operation, print the final value of the number on the screen.
            Note: There is no exception checking.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        methodOfThePattern(number, number - 5, true, true);
    }

    static void methodOfThePattern(int constantFirstNum, int processedNum, boolean isSubtraction, boolean firstTime){

        if(firstTime) System.out.print(constantFirstNum + " ");

        System.out.print(processedNum + " ");

        if(isSubtraction)
        {
            if(processedNum > 0) methodOfThePattern(constantFirstNum, processedNum - 5, true, false);
            else methodOfThePattern(constantFirstNum, processedNum + 5, false, false);
        }
        else
        {
            if(processedNum < constantFirstNum) methodOfThePattern(constantFirstNum, processedNum + 5, false, false);
        }
    }
}