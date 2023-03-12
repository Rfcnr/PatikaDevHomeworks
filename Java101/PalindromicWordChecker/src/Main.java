import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Palindromic Word Checker
            Program that checks whether the entered string is a palindrome.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scan.nextLine();

        if (isPalindrome(input)) System.out.println(input + " is a palindrome.");
        else System.out.println(input + " is not a palindrome.");
    }

    private static boolean isPalindrome(String word){
        int left = 0, right = word.length() - 1;
        while (left < right){
            if(Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) return false;

            left++;
            right--;
        }
        return true;
    }
}