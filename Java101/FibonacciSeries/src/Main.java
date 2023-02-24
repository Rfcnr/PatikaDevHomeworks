import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Fibonacci Series
            The program that prints the elements of the Fibonacci series on the screen.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();

        int previousTwo = 0, previousOne = 1, fibonacci;

        if(n >= 1)
            System.out.print(0 + " " + 1);

        for (int i = 1; i < n; i++) {

            fibonacci = previousOne + previousTwo;

            System.out.print(" " + fibonacci);
            previousTwo = previousOne;
            previousOne = fibonacci;
        }
    }
}