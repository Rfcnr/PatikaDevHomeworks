public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Prime Numbers From Zero To One Hundred
            A program that prints prime numbers between zero and one hundred when it runs.
            Note: There is no exception checking.
         */

        System.out.print("2");

        for (int i = 3; i < 100; i++) {
            if(isPrime(i)) System.out.print(" " + i);
        }
    }

    private static boolean isPrime(int number)
    {
        if(number < 2) return false;
        else if(number == 2) return true;
        else if (number % 2 == 0) return false;
        else
        {
            for (int i = number - 1; i > 2 ; i--) {
                if(number % i == 0) return false;
            }
        }
        return true;
    }
}