// This program will as to user enter a radius and the program will calculate the circumference and volume of the circle.

package src;

import java.util.Locale;
import java.util.Scanner;
import src.entities.Calculator;

public class Program2 {

    public static final double PI = 3.14159;
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.print("Enter radius ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circunference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }

}
