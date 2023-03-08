import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Sort The One Dimensional Array
            A program that sorts the numbers entered by the user from smallest to largest.
            Note: There is no exception checking.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.printf("Sorted array: %s", Arrays.toString(arr));
    }
}