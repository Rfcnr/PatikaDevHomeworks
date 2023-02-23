import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Perfect Number
            A program that finds whether the number entered by the user is a perfect number.
            Note: There is no exception checking.
         */
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();

        int sum = 0;

        for (int i = 1; i < (number / 2); i++)
            if(number % i == 0) sum += i;

        System.out.println((sum * 2 == number) ? number + " is a perfect number." : number + " is not a perfect number.");
    }
}