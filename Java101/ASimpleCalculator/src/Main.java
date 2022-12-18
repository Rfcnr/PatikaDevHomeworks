import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
            PatikaDev Java101 - Simple Calculator
            This program receives an operation number and two operands (numeric) from the user.
            It gives results according to the selected operation.

            Note: There is no exception checking.
         */

        Scanner scanner = new Scanner(System.in);

        boolean keepGoing = true;
        while (keepGoing){
            int num1, num2;
            System.out.println("\n\nEnter first number: ");
            num1 = scanner.nextInt();
            System.out.println("Enter second number: ");
            num2 = scanner.nextInt();

            System.out.println("Select operation: \n1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n0 - EXIT");
            int selected = scanner.nextInt();

            switch (selected)
            {
                case 1:
                    System.out.printf("%1$d + %2$d = %3$d", num1, num2, num1 + num2);
                    break;
                case 2:
                    System.out.printf("%1$d - %2$d = %3$d", num1, num2, num1 - num2);
                    break;
                case 3:
                    System.out.printf("%1$d * %2$d = %3$d", num1, num2, num1 * num2);
                    break;
                case 4:
                    System.out.printf("%1$d / %2$d = %3$s", num1, num2, num2 != 0 ? (float)num1 / num2 : " undefined");
                    break;
                case 0:
                    keepGoing = false;
                default:
                    System.out.println("\nInvalid entry!");
            }
        }
    }
}