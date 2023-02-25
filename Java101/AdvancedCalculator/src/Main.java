import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Advanced Calculator
            The calculator that makes the user selected operations.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        int select;
        String menu = """

                ***** MENU *****
                1- Addition
                2- Subtraction
                3- Multiplication
                4- Division
                5- Involve
                6- Factorial
                7- Mode
                8- Calculate area and perimeter of a rectangle
                0- EXIT
                ****************
                """;

        do {
            System.out.println(menu);
            System.out.print("Please select a process :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectAreaAndPerimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("You entered a wrong value, please try again.");
            }
        } while (select != 0);

    }

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 0;
        while (true) {
            System.out.print(++i + ". number : ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter? :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("The divisor can not be 0!");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of base :");
        int base = scan.nextInt();
        System.out.print("Enter the number of exponent :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void mode(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();
        System.out.print("Enter the mod value : ");
        int mode = scan.nextInt();

        System.out.println("Result : " + (number % mode));
    }

    static void rectAreaAndPerimeter(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first edge measure : ");
        int a = scan.nextInt();
        System.out.print("Enter the second edge measure : ");
        int b = scan.nextInt();

        System.out.println("Rect Area : " + (a * b) + " and Rect Perimeter: " + (2 *(a + b)));
    }
}