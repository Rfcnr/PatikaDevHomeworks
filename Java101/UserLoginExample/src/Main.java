import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - User Login Example

            Registered user login with username and password is provided.
            Added the ability to change password or user after login.
            default username: admin
            default password: 1234
        */

        String registeredUserName = "admin", registeredPassword = "1234";
        String enteredUserName, enteredPassword;
        boolean isLoggedIn = false;

        Scanner scanner = new Scanner(System.in);

        boolean keepGoing = true;
        while (keepGoing)
        {
            String select;
            if (isLoggedIn)
            {
                System.out.println("\nHello " + registeredUserName
                        + ".\nPlease select the action you want to do."
                        + "\n(1) Change username and password."
                        + "\n(2) Sign Out"
                        + "\n(0) EXIT");

                select = scanner.next().replace(" ", "");
                if(!select.isBlank())
                {
                    if(select.equals("1"))
                    {
                        boolean isItValid = false;
                        while (!isItValid)
                        {
                            System.out.print("\nPlease enter new username: ");
                            String newUserName = scanner.next().replace(" ", "");

                            System.out.print("\nPlease enter new password: ");
                            String newPassword = scanner.next().replace(" ", "");

                            if(!newUserName.isBlank() && !newPassword.isBlank())
                            {
                                registeredUserName = newUserName;
                                registeredPassword = newPassword;

                                System.out.printf("Successful! \nNew user name: %1$s\nNew password: %2$s\n",newUserName, newPassword);
                                System.out.print("\nChecked out. You can login with new user name and password.\n");
                                isLoggedIn = false;
                                isItValid = true;
                            }
                            else
                            {
                                System.out.println("Invalid entry! (Username or password can not be empty.)");

                                while (true)
                                {
                                    System.out.print("""
                                            .
                                            Please select the action you want to do.
                                            (1) Try Again.
                                            (2) Cancel It!""");

                                    String input = scanner.nextLine().replace(" ", "");
                                    if(input.equals("1"))
                                    {
                                        break;
                                    }
                                    else if(input.equals("2"))
                                    {
                                        isItValid = true;
                                        break;
                                    }
                                    else System.out.println("Invalid entry!");
                                }
                            }
                        }


                    }
                    else if(select.equals("2"))
                    {
                        System.out.println("LOGGED OUT!!!");
                        isLoggedIn = false;
                    }
                    else if (select.equals("0"))
                    {
                        System.out.println("Exited The Program.");
                        keepGoing = false;
                    }
                    else System.out.println("Invalid entry!");
                }
                else System.out.println("Invalid entry!");
            }
            else
            {
                System.out.println("""
                        Please select the action you want to do.
                        (1) Log In.
                        (2) Sign Up
                        (0) EXIT""");

                select = scanner.next().replace(" ", "");
                if(!select.isBlank())
                {
                    if(select.equals("1"))
                    {
                        System.out.print("\nPlease enter username: ");
                        enteredUserName = scanner.next().replace(" ", "");

                        System.out.print("\nPlease enter password: ");
                        enteredPassword = scanner.next().replace(" ", "");

                        if(enteredUserName.equals(registeredUserName) && enteredPassword.equals(registeredPassword))
                        {
                            System.out.print("\nLogin Successful!\n");
                            isLoggedIn = true;
                        }
                        else
                        {
                            System.out.print("\nWrong user name or password!!!\n");
                        }
                    }
                    else if(select.equals("2"))
                    {
                        System.out.print("\nPlease enter username: ");
                        enteredUserName = scanner.next().replace(" ", "");

                        System.out.print("\nPlease enter password: ");
                        enteredPassword = scanner.next().replace(" ", "");

                        if(!enteredUserName.isBlank() && !enteredPassword.isBlank())
                        {
                            registeredUserName = enteredUserName;
                            registeredPassword = enteredPassword;

                            System.out.printf("New User Registration done.\nUsername: %1$s\nPassword: %2$s\n\n", registeredUserName, registeredPassword);
                        }
                        else System.out.println("Invalid entry! (Username or password can not be empty.)");
                    }
                    else if (select.equals("0"))
                    {
                        System.out.println("Exited The Program.");
                        keepGoing = false;
                    }
                    else System.out.println("Invalid entry!");
                }
                else System.out.println("Invalid entry!");
            }

        }




    }


}