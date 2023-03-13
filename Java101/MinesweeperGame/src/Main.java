import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Minesweeper Game (Capstone Project)
            Minesweeper game program played according to the user's data entries.
            Note: There is no exception checking.
         */

        startNewGame();
    }

    static void startNewGame(){
        Scanner scanner = new Scanner(System.in);

        printStartMessage();

        int row, col;
        while (true)
        {
            System.out.print("Enter the row count (min: 3 & max: 9) : ");
            row = scanner.nextInt();

            System.out.print("Enter the column count (min: 3 & max: 9) : ");
            col = scanner.nextInt();

            if(row >= 3 && row <= 9 && col >= 3 && col <= 9) break;
            else System.out.println("Invalid entry! Values should be minimum 3 and maximum 9.");
        }

        System.out.println("\nStarting The Game\n");

        Minesweeper minesweeper = new Minesweeper(row, col);

    }

    static void printStartMessage(){
        System.out.println("""

        ******************************* Minesweeper Game *******************************
        --         You will enter the number of rows and columns in the matrix        --
        
        --             Row and column values should be minimum 3 and maximum 9        --
        --                      for proper display on the console                     --
        
        --                  I will place the mines and ask you for the                --
        --                row and column numbers to clear the area without            --
        --                          being caught by the mines.                        --
        
        --                         Don't worry, I'll help you.                        --
        --                              LET'S GET STARTED...                          --
        --------------------------------------------------------------------------------
        """);
    }
}