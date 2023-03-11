import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int right = 5;
    static int incorrectEntry = 0;

    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Number Guessing Game
            A game to find randomly selected numbers between 0 and 100.
            Note: There is no exception checking.
         */

        startNewGame();
    }

    static void startNewGame(){
        Scanner scanner = new Scanner(System.in);

        printStartMessage();

        right = 5;
        incorrectEntry = 0;

        int number = (int) (Math.random() * 101);
        List<Integer> forecasts = new ArrayList<>();

        boolean isTheRoundOver = false;
        while (!isTheRoundOver)
        {
            if(right == 1) System.out.print("Enter your last guess: ");
            else System.out.print("Enter your guess: ");

            int guess = scanner.nextInt();

            if(guess >= 0 && guess <= 100)
            {
                incorrectEntry = 0;
                right--;
                forecasts.add(guess);

                if(guess == number)
                {
                    System.out.println("*** YOU WIN ***");
                    isTheRoundOver = true;
                    roundOver(true, number, forecasts);
                }
                else if(guess > number)
                {
                    System.out.println("INCORRECT: Your guess is bigger than the number.");
                }
                else {
                    System.out.println("INCORRECT: Your guess is smaller than the number.");
                }
            }
            else
            {
                incorrectEntry++;
                switch (incorrectEntry) {
                    case 1 -> System.out.println("Incorrect entry. Try again.");
                    case 2 -> System.out.println("If you enter incorrectly one more time, you will lose 1 guess.");
                    case 3 -> {
                        right--;
                        System.out.println("Your 3rd incorrect entry. You lose 1 guess.");
                        incorrectEntry = 0;
                    }
                }
            }

            if(right == 0){
                isTheRoundOver = true;
                roundOver(false, number, forecasts);
            }
        }
    }

    static void printStartMessage(){
        System.out.println("""

        ******************** Number Guessing Game *********************
        -- I kept a number between 0 and 100 (including 0 and 100).  --
        --          I want you to guess this number.                 --
        --         You have 5 chances to guess correctly.            --
        --              Don't worry, I'll help you.                  --
        --                  Let's get started...                     --
        ---------------------------------------------------------------
        """);
    }

    static void roundOver(boolean isWin, int number, List<Integer> guesses){

        if(isWin) System.out.printf("\nYou Win! Congratulations...\nHidden number: %1$d\nYour guesses: %2$s", number, guesses.toString());
        else System.out.printf("You Lost!!! \nHidden number: %1$d\nYour guesses: %2$s\n", number, guesses.toString());

        menu();
    }

    static void menu(){
        System.out.print("\nDo you want to play again?\nYes (1)\nNo, exit game (0)\nPlease enter your choice (1 or 0): ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if(choice == 1) startNewGame();
        else if(choice == 0) System.out.print("Goodbye...");
        else menu();
    }
}