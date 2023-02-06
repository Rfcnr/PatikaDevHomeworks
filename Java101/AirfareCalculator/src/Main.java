import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Airfare Calculator
            Make a program that calculates the air ticket price according to the distance and conditions.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the distance (Km) : ");
        int distance = scan.nextInt();

        System.out.print("\nEnter the age of the passenger : ");
        int age = scan.nextInt();

        System.out.print("\nEnter the type of ticket => One Way (1) or Round Trip (2) : ");
        int ticketType = scan.nextInt();

        if(distance < 1 || age < 1 || ticketType < 1 || ticketType > 2) System.out.println("\nIncorrect entry.!");

        double ticketPrice = distance * 0.1 * ticketType;

        double discountRate = (ticketType == 1) ? 0.0 : 0.2;

        discountRate = (age < 12) ? discountRate + 0.5 : (age <= 24) ? discountRate + 0.1 : (age > 65) ? discountRate + 0.3 : discountRate;

        System.out.printf("Ticket Price : %1$.2f TL", (ticketPrice * (1 - discountRate)));
    }
}