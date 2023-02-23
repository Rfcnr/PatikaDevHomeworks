import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Smallest And Largest Common Factor
            A program that calculates the greatest common divisor (gcd) and the least common multiple (lcm) of two numbers.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the n1: ");
        int n1 = scan.nextInt();
        System.out.print("Enter the n2: ");
        int n2 = scan.nextInt();

        System.out.printf("gcd : %1$d \nlcm: %2$d", gcd(n1,n2), lcm(n1, n2));
    }

    private static int gcd(int n1, int n2){
        int divisor = Math.min(n1, n2);
        int result = 1;
        while (divisor >= 2)
        {
            if(n1 % divisor == 0 && n2 % divisor == 0)
            {
                result = divisor;
                break;
            }
            divisor--;
        }
        return result;
    }

    private static int lcm(int n1, int n2){
        return (n1 * n2) / gcd(n1, n2);
    }
}