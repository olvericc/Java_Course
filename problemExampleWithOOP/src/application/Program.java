package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle t1, t2;

        t1 = new Triangle();
        t2 = new Triangle();

        System.out.println("Enter the measures of Triangle x: ");
        t1.a = sc.nextDouble();
        t1.b = sc.nextDouble();
        t1.c = sc.nextDouble();
        System.out.println("Enter the measures of Triangle y: ");
        t2.a = sc.nextDouble();
        t2.b = sc.nextDouble();
        t2.c = sc.nextDouble();

        double perimeter = (t1.a + t1.b + t1.c) / 2.0;

        double areaT1 = Math.sqrt(perimeter * (perimeter - t1.a) * (perimeter - t1.b) * (perimeter - t1.c));

        perimeter = (t2.a + t2.b + t2.c) / 2.0;
        double areaT2 = Math.sqrt(perimeter * (perimeter - t2.a) * (perimeter - t2.b) * (perimeter - t2.c));

        System.out.printf("Triangle 1 area: %.4f%n", areaT1);
        System.out.printf("Triangle 2 area: %.4f%n", areaT2);

        if (areaT1 > areaT2) {
            System.out.println("Larger area: Triangle 1");
        }
        else {
            System.out.println("Larger area: Triangle 2");
        }

        sc.close();

    }
}
