import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*
            PatikaDev Java101 - Exponential Number Calculator.
            A program that calculates exponential numbers using for loop.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double number = scan.nextInt();

        System.out.print("Enter the pow: ");
        double pow = scan.nextInt();

        if(number == 0 && pow <= 0 )
        {
            System.out.printf("%1$.2f^%2$.2f = undefined!", number, pow);
            return;
        }

        double result = 1;

        for (int i = 1; i <= Math.abs(pow); i++) {
            result *= number;
        }

        if(pow < 0){
            result = 1 / result;
        }

        System.out.printf("%1$.2f^%2$.2f = %3$f", number, pow, result);

    }
}