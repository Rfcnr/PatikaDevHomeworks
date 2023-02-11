import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Add Up The Multiples Of Four
            We write the program that accepts the inputs from the user until an odd number is entered
        and adds the numbers that are even and multiples of 4 from the entered values and prints
        them on the screen.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);
        int total = 0;
        do {
            System.out.print("Enter the number: ");
            int number = scan.nextInt();

            if (number % 2 == 0)
            {
                if(number % 4 == 0)
                {
                    total += number;
                }
            }
            else break;

        }while (true);

        System.out.println("Total: " + total);
    }
}