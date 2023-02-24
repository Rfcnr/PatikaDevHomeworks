import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Palindrome Checker
            Program that checks whether the entered integer is a palindrome.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();

        if (isPalindrome(number)) System.out.println(number + " is a palindrome.");
        else System.out.println(number + " is not a palindrome.");
    }

    private static boolean isPalindrome(int n){

        String str1 = Integer.toString(n);
        String str2 = new StringBuilder(str1).reverse().toString();

        return str1.equals(str2);
    }
}