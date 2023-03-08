import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Find Repeating Even Numbers
            A program that finds repeating even numbers in a sequence of numbers.
            Note: There is no exception checking.
         */

        int[] arr = {1, 3, 4 , 2, 4, 8, 0, 0, 4, 12, 22, 54, 22, 4, 54, 22, 54};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
            {
                for (int j = i + 1; j < arr.length; j++) {
                    if(arr[i] == arr[j])
                    {
                        if(!list.contains(arr[i])) list.add(arr[i]);
                        list.add(arr[j]);
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(list.toArray()));
    }
}