package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // triangle x data
        double xA, xB, xC;
        // triangle y data
        double yA, yB, yC;

        System.out.println("Enter the measures of triangle x: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double perimeter = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(perimeter * (perimeter - xA) * (perimeter - xB) * (perimeter - xC));

        perimeter = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(perimeter * (perimeter - yA) * (perimeter - yB) * (perimeter - yC));

        System.out.printf("Triangle x area: %.4f%n", areaX);
        System.out.printf("Triangle y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: x");
        }
        else {
            System.out.println("Larger area: y");
        }

        sc.close();

    }

}