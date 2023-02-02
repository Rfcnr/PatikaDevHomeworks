import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Sorting Numbers
            Write a program that sorts the 3 entered numbers "from least to greatest".

            Note: There is no exception checking.
        */

        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers to be sorted.");

        System.out.print("1. number (a) : ");
        a = scanner.nextInt();
        System.out.print("2. number (b) : ");
        b = scanner.nextInt();
        System.out.print("3. number (c) : ");
        c = scanner.nextInt();

        if(a < b)
        {
            if(b == c) System.out.println("a < b == c");
            else if (b < c) System.out.println("a < b < c");
            else
            {
                if(a == c) System.out.println("a == c < b");
                else if(a < c) System.out.println("a < c < b");
                else System.out.println("c < a < b");
            }
        }
        else if(a == b)
        {
            if(b == c) System.out.println("a == b == c");
            else if (b < c) System.out.println("a == b < c");
            else System.out.println("c < a == b");
        }
        else{
            if(b == c) System.out.println("b == c < a");
            else if (b > c) System.out.println("c < b < a");
            else{
                if(a == c) System.out.println("b < a == c");
                else if(a < c) System.out.println("b < a < c");
                else System.out.println("b < c < a");
            }
        }
    }
}