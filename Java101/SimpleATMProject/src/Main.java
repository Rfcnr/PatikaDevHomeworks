import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            PatikaDev Java101 - Simple ATM Project
            A simple ATM simulation that works based on the data it receives from the user.
            Note: There is no exception checking.
         */

        String userName, password;
        Scanner scan = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("User Name :");
            userName = scan.nextLine();
            System.out.print("Password : ");
            password = scan.nextLine();

            if (userName.equals("patika") && password.equals("dev123"))
            {
                System.out.println("Hello, Welcome to Kodluyoruz Bank!");
                do
                {
                    System.out.println("1- To deposit\n" +
                            "2- Withdrawal\n" +
                            "3- Balance inquiry\n" +
                            "4- Exit");
                    System.out.print("Please select the action you want to take : ");
                    select = scan.nextInt();

                    switch (select)
                    {
                        case 1:
                            System.out.print("Money amount : ");
                            int price1 = scan.nextInt();
                            balance += price1;
                            break;
                        case 2:
                            System.out.print("Money amount : ");
                            int price2 = scan.nextInt();

                            if (price2 > balance)
                            {
                                System.out.println("Insufficient balance!");
                            }
                            else
                            {
                                balance -= price2;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance : " + balance);
                            break;
                    }
                } while (select != 4);

                System.out.println("See you again soon.");
                break;
            }
            else
            {
                right--;
                System.out.println("Incorrect username or password. Please try again.");

                switch (right)
                {
                    case 0:
                        System.out.println("Your account has been blocked, please contact the bank.");
                        break;
                    default:
                        System.out.println("Your remaining right : " + right);
                        break;
                }
            }
        }
    }
}