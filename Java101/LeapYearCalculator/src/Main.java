import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Leap Year Calculator
            Write a program that finds whether the year entered by the user is a leap year or not.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scan.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || (year % 400 == 0)))
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}