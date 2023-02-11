import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - The average of twelve and multiples.
            Write a program that calculates the average of the numbers
        from 0 to the entered number that is exactly divisible by 3 and 4.

            A program that calculates the average of 12 (3*4) and its multiples from numbers
        starting from zero to the entered number.

            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int number = scan.nextInt();

        int total = 0, amount = 0;
        int currentNumber = number >= 12 ? 12 : number + 1;

        while (currentNumber <= number)
        {
            total += currentNumber;
            amount++;

            currentNumber = 12 * (amount + 1);
        }

        if(amount > 0) System.out.println("Average: " + (total / amount));
        else System.out.println("Common factor not found! Average: 0");
    }
}