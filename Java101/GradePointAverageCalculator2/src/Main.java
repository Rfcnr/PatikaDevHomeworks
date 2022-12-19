import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            PatikaDev - Java101 - Grade Point Average Calculator 2
            Courses: Mathematics, Physics, Turkish, Chemistry, Music
            Passing Grade : 55
            If the course grades entered are not between 0 or 100, they should not be included in the average.

            The grades of 5 courses are entered, and it is checked whether the average is 55 and above.
            If the average is less than 55, the student is flunking.
        */

        int mathematics, physics, turkish, chemistry, music;
        Scanner scanner = new Scanner(System.in);

        List<Integer> grades = new ArrayList<>();

        System.out.print("Please enter Mathematics grade: ");
        mathematics = scanner.nextInt();
        if(mathematics >= 0 && mathematics <= 100) grades.add(mathematics);

        System.out.print("Please enter Physics grade: ");
        physics = scanner.nextInt();
        if(physics >= 0 && physics <= 100) grades.add(physics);

        System.out.print("Please enter Turkish grade: ");
        turkish = scanner.nextInt();
        if(turkish >= 0 && turkish <= 100) grades.add(turkish);

        System.out.print("Please enter Chemistry grade: ");
        chemistry = scanner.nextInt();
        if(chemistry >= 0 && chemistry <= 100) grades.add(chemistry);

        System.out.print("Please enter Music grade: ");
        music = scanner.nextInt();
        if(music >= 0 && music <= 100) grades.add(music);

        int sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }

        double average = (grades.size() >= 1) ? (double)sum / grades.size() : 0;

        System.out.printf("Grade-average: %.1f", average);
        System.out.println(average >= 55 ? " (The student passed the class.)":" (Student failed in class.)");
    }
}