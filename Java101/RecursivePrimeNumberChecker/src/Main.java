import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Recursive Prime Number Checker
            A program that uses the "Recursive" method
        to find whether the number received from the user is a "Prime" number.
            Note: There is no exception checking.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int number = scanner.nextInt();

        if(isPrime(number, number / 2)) System.out.println(number + " is prime.");
        else System.out.println(number + " is not prime.");
    }

    static boolean isPrime(int num, int divisor){

        if(num < 2) return false;
        else if(divisor == 1) return true;
        else
        {
            if(num % divisor == 0) return false;
            else return isPrime(num, divisor - 1);
        }
    }
}