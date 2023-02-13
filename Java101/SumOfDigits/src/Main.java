import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Sum Of Digits
            A program that calculates the sum of the digits of the entered number.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = Math.abs(scan.nextInt());
        int currentNumber = number;
        int digit;
        int result = 0;
        while (number != 0)
        {
            digit = currentNumber % 10;

            result += digit;

            currentNumber -= digit;

            if(currentNumber >= 10) currentNumber /= 10;
            else break;
        }

        System.out.print("Sum of digits for (" + number + ") : " + result);
    }
}