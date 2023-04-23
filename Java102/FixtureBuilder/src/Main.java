import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev Java102 - Fixture Builder

            A program that generates random match fixtures for teams entered in Java.
        */

        Scanner scanner = new Scanner(System.in);

        Fixture fixture = new Fixture();

        System.out.println("\nWelcome to fixture builder.\nAt least 3 teams are required to create a fixture.");
        System.out.println("\n1) Create fixtures by entering team names,\n2) Create fixtures from default teams.");
        int selection;
        while (true){
            System.out.println("Please enter your selection. (1 or 2) : ");
            try {
                selection = scanner.nextInt();
                if (selection == 1 || selection == 2)
                    break;
                else System.out.println("Invalid entry!");
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry!");
            }
        }

        if(selection == 1){
            List<Team> teams = new ArrayList<>();
            int teamCount;

            while (true){
                System.out.println("How many teams will you enter?. (min 3 - max 20) : ");
                try {
                    teamCount = scanner.nextInt();
                    if (teamCount >= 3 && teamCount <= 20)
                        break;
                    else System.out.println("Invalid entry!");
                } catch (InputMismatchException e) {
                    System.out.println("Invalid entry!");
                }
            }
            scanner.nextLine();

            for (int i = 0; i < teamCount; i++) {
                System.out.println("Enter Team " + (i+1) + " name: ");
                String teamName = scanner.nextLine().trim();

                if (teamName.isBlank() || teamName.isEmpty()) {
                    teamName = "Team " + (i + 1);
                }
                teams.add(new Team(i, teamName.toUpperCase()));
            }
            fixture.createFixture(teams);
        }
        else fixture.createFixtureFromDefaultTeamList();
    }
}