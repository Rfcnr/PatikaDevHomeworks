import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Program to Find Hypotenuse in Right Triangle
            Write a program in Java that takes the length of the perpendicular
        sides from the user and calculates the hypotenuse.

            Homework
            Write a program that calculates the area of the triangle whose three side lengths
        you get from the user.
            e1 and e2: perpendicular sides
            h: hypotenuse
            a: area
            p: perimeter length

            Formulas to be used:
            perimeter: p = e1 + e2 + h;
            area : e1 * e2 / 2;
            hypotenuse: h = √((e1*e1)+(e2*e2))

            NOTE: The two side lengths are taken and the calculated hypotenuse,
        perimeter, and area values are printed.
            NOTE: No exception checks have been made.
        */

        Scanner input = new Scanner(System.in);
        double e1, e2, h, a, p;

        System.out.println("Please write the 1st edge length of the triangle. (not hypotenuse)");
        e1 = input.nextDouble();
        System.out.println("Please write the 2nd edge length of the triangle. (not hypotenuse)");
        e2 = input.nextDouble();

        h = Math.sqrt((e1*e1) + (e2*e2));
        p = e1 + e2 + h;
        a = e1 * e2 / 2;

        System.out.println("For Right Triangle;"
                + "\nHypotenus: " + h
                + "\nPerimeter: " + p
                + "\nArea: " + a);
    }
}