import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Array Frequency
            A program that prints the number of repetitions of the numbers in the given array on the screen.
            Note: There is no exception checking.
         */

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        System.out.printf("%n Array: %1$s%n Repetitions;%n %2$s", Arrays.toString(arr), frequency(arr));

    }

    static String frequency(int[] arr)
    {
        StringBuilder result = new StringBuilder();

        List<int[]> repeatsList = new ArrayList<>();

        for (int key : arr)
        {
            boolean isThere = false;
            for (int[] item : repeatsList)
            {
                if(item[0] == key)
                {
                    item[1]++;
                    isThere = true;
                    break;
                }
            }

            if(!isThere){
                int [] couple = {key, 1};
                repeatsList.add(couple);
            }
        }

        for (int[] couple : repeatsList)
        {
            result.append("The number ").append(couple[0]).append(" was repeated ").append(couple[1]).append(" times.\n ");
        }

        return result.toString();
    }
}