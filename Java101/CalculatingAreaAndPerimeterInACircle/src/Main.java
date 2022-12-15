import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            Program to Calculate the area and perimeter of a circle.
            Write a program in Java that calculates the area and
        perimeter of a circle whose radius you get from the user.
            Area Formula: 𝜋 * r * r;
            Perimeter Formula: 2 * 𝜋 * r;

            Homework
            Write a program that finds the area of a slice of the circle
        with radius r and measure 𝛼 of the central angle.

            Take 𝜋 = 3.14
            Formula : 𝜋 * r * r * 𝛼 / 360;
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        System.out.printf("Radius: %1$f - Area: %2$f\n" ,radius, calculateCircleAreaByRadius(radius));

        System.out.printf("Radius: %1$f - Perimeter: %2$f\n" ,radius, calculateCirclePerimeterByRadius(radius));

        System.out.print("Enter center angle of circles piece: ");
        double angle = scanner.nextDouble();

        System.out.printf("Radius: %1$f - Center Angle: %2$f - Piece Area: %3$f " ,radius, angle, calculateCircleAreaByRadiusAndCenterAngle(radius, angle));

    }

    private static double calculateCircleAreaByRadius(double radius){
        return Math.PI * Math.pow(radius,2);
    }

    private static double calculateCirclePerimeterByRadius(double radius){
        return Math.PI * radius * 2;
    }

    private static double calculateCircleAreaByRadiusAndCenterAngle(double radius, double angle){
        return Math.PI * Math.pow(radius,2) * angle/360;
    }



}