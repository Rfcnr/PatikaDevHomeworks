import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            PatikaDev Java101 - ActivityRecommender

            Suggest to "Ski" if the temperature is less than 5.
            Suggest the "Cinema" event if the temperature is between 5 and 15.
            Suggest the "Picnic" event if the temperature is between 15 and 25.
            Suggest the "Swimming" event if the temperature is greater than 25.
        */

        Scanner scanner = new Scanner(System.in);
        int airT;

        System.out.print("Enter the temperature of the air: ");
        airT = scanner.nextInt();

        System.out.println(((airT > 5)?((airT < 15)?"You can go to the cinema."+((airT > 10)?"\nYou can go for a picnic!":""):((airT < 25)?"You can go for a picnic!":"You can go swimming!")):"You can go skiing!"));
    }
}