import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Harmonic Average Of Array Elements
            The program that calculates the harmonic average of the numbers in the array.
            Note: There is no exception checking.
         */

        int[] list = {1, 5, 9, 56, 4, 0 ,-3, -15, 22, 54};

        System.out.printf("Array : %1$s \nHarmonic series of array : %2$.2f \nHarmonic Average Of Array: %3$.2f",
                Arrays.toString(list), harmonicSumOfArray(list), (harmonicSumOfArray(list) / list.length));
    }

    static double harmonicSumOfArray(int[] arr){

        double result = 0.0;

        for (int num : arr) {
            if(num != 0) result += 1.0 / num;
        }

        return result;
    }
}