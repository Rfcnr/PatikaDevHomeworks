import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
            PatikaDev Java101 - Greengrocer Cashier Program

            Write a program in Java that prints the total amount of the products purchased
            from the greengrocer store, according to the kilogram values, to the screen.

            Fruits and KG Unit Prices:
            Pear: 2.14 TL
            Apple: 3.67 TL
            Tomatoes: 1.11 TL
            Banana: 0.95 TL
            Eggplant: 5.00 TL
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pear (kg) : ");
        double pear = scanner.nextDouble();
        System.out.print("Apple (kg) : ");
        double apple = scanner.nextDouble();
        System.out.print("Tomatoes (kg) : ");
        double tomatoes = scanner.nextDouble();
        System.out.print("Banana (kg) : ");
        double banana = scanner.nextDouble();
        System.out.print("Eggplant (kg) : ");
        double eggplant = scanner.nextDouble();

        double[] unitPrices = new double[]{2.14, 3.67, 1.11, 0.95, 5};
        double[] weights = new double[]{pear, apple, tomatoes, banana, eggplant};

        System.out.printf("Total Amount : %.2f TL.", calculateTheTotal(weights,unitPrices));

    }

    private static double calculateTheTotal(double[] weights, double[] unitPrices){
        double totalAmount = 0;
        for (int i = 0; i < weights.length; i++) {
            totalAmount += weights[i] * unitPrices[i];
        }
        return totalAmount;
    }
}