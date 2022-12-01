import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            VAT Amount Calculator Program
            Write a program that calculates the VAT amount and VAT included amount of the monetary value
        received from the user with Java and prints it on the screen.
            If the monetary value is between 0 and 1000, the VAT rate is 18%.
            If the monetary value is greater than 1000, the VAT rate is 8%.

            NOTE: No exception checks have been made.
        */

        Scanner input = new Scanner(System.in);
        double amount, taxRate;

        System.out.println("Please enter the money amount to be calculated.");

        amount = input.nextDouble();

        taxRate = (amount > 1000) ? 0.08d : 0.18d;

        System.out.println("Amount: " + amount + "\nVAT (" + (taxRate * 100) + "%) : "
            + (amount * taxRate) + "\nTotal Amount: " + (amount + (amount * taxRate)));
    }
}