import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            PatikaDev Java101 - Body Mass Index Calculator
            With Java, take the height and weight values from the user and assign them to a variable.
            Calculate the user's "Body Mass Index" according to the formula below and print it on the screen.

            Formula
            Weight (kg) / ( Height (m) * Height (m) );
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease enter your height (meters) : ");
        double height = scanner.nextDouble();
        System.out.print("\nPlease enter your weight (kg) : ");
        double weight = scanner.nextDouble();
        System.out.printf("\nBody Mass Index: %f", calculateBodyMassIndex(height, weight));
    }

    private static double calculateBodyMassIndex(double h, double w){
        return w / Math.pow(h,2);
    }
}