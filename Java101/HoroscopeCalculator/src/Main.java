import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Horoscope Calculator
            It takes the day and month of birth information from the user numerically
            and prints the calculated horoscope on the screen.

            Note: There is no exception checking.
            Note: If-else decision structure is used in the calculation.
        */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your birth month as a number: ");
        int month = scan.nextInt();
        System.out.print("Enter your birth day as a number: ");
        int day = scan.nextInt();
        scan.close();

        String horoscope = "";

        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            horoscope = "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 17)) {
            horoscope = "Aquarius";
        } else if ((month == 2 && day >= 18) || (month == 3 && day <= 19)) {
            horoscope = "Pisces";
        } else if ((month == 3 && day >= 20) || (month == 4 && day <= 19)) {
            horoscope = "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            horoscope = "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            horoscope = "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            horoscope = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            horoscope = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            horoscope = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            horoscope = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            horoscope = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            horoscope = "Sagittarius";
        }

        System.out.println("Your zodiac sign based on your birth date: " + horoscope);
    }
}