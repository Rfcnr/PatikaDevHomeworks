import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java101 - Chinese Zodiac Calculator
            Write a program that takes the birth year from the user and calculates the Chinese Zodiac value.
            Note: There is no exception checking.
         */

        Scanner scan = new Scanner(System.in);

        String[] zodiacSigns = {"Monkey", "Rooster", "Dog", "Pig", "Mouse", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"};

        System.out.print("Enter the birth year : ");

        System.out.println("Your zodiac sign is " + zodiacSigns[scan.nextInt() % 12]);
    }
}