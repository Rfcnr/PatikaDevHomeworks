import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        NOTES:
            No exception checks are made.
            The IF-ELSE structure is not used.
        */

        //Create variables
        int mathematics, physics, chemistry, turkish, history, music;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your Mathematics grade: ");
        mathematics = scanner.nextInt();

        System.out.println("Please enter your Physics grade: ");
        physics = scanner.nextInt();

        System.out.println("Please enter your Chemistry grade: ");
        chemistry = scanner.nextInt();

        System.out.println("Please enter your Turkish grade: ");
        turkish = scanner.nextInt();

        System.out.println("Please enter your History grade: ");
        history = scanner.nextInt();

        System.out.println("Please enter your Music grade: ");
        music = scanner.nextInt();

        int sum = mathematics + physics + chemistry + turkish + history + music;

        double average = sum / 6.0d;

        System.out.println(((average > 60)? "You passed the class.":"You failed the class."));

    }
}