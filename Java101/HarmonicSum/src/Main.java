import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Harmonic Sum
            The program that gives the harmonic sum of the numbers from the entered number to 0.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a nonzero integer: ");
        int number = scan.nextInt();

        int n = Math.abs(number);
        double harmonicSum = 0.0;

        for (int i = 1; i <= n; i++) {
            if(number >= 0)
                harmonicSum += 1.0 / i;
            else
                harmonicSum -= 1.0 / i;
        }

        System.out.println("Harmonic Sum : " + harmonicSum);
    }
}