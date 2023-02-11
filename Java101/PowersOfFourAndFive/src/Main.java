import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Powers Of Four And Five
            A program that prints the powers of 4 and 5 from the numbers
            starting from zero up to the entered number on the screen.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int pow = 0;

        while (true)
        {
            int p4 = (int)Math.pow(4,pow);
            if(p4 <= number) System.out.printf("4^%1$d = %2$d --- ", pow, p4);

            int p5 = (int)Math.pow(5,pow);
            if(p5 <= number) System.out.printf("5^%1$d = %2$d\n", pow, p5);
            else System.out.println();

            if(p4 >= number && p5 >= number) break;

            pow++;
        }
    }
}