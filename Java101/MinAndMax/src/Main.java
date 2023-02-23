import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Min And Max Number Finder
            The program that finds the smallest and largest numbers from the entered numbers.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();

        if(counter < 2)
        {
            System.out.println("Incorrect entry! You must enter at least two positive integers.");
            return;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (counter > 0)
        {
            System.out.print("Enter the number: ");
            int number = scan.nextInt();

            min = Math.min(number, min);
            max = Math.max(number, max);

            counter--;
        }

        System.out.printf("Min : %1$d \nMax : %2$d", min, max);
    }
}