import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Combination Calculator
            A program that calculates the combination of n with r.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the positive integers n and r for C(n,r) ( n >= r > 0 )\nEnter n: ");
        int n = scan.nextInt();
        System.out.print("Enter r: ");
        int r = scan.nextInt();

        if(n > 0 && n >= r)
        {
            System.out.printf("C(n,r) = %d", (factorial(n) / (factorial(r) * factorial(n-r))));
        }
        else System.out.println("Invalid entered!");
    }

    static int factorial(int x){
        if(x == 0) return 1;
        else return x * factorial(x - 1);
    }
}