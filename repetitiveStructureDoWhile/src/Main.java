import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        char resp;

        do {
            System.out.print("type the temperature in celsius: ");
            double celsius = sc.nextDouble();

            double fahrenheit = 9.0 * celsius / 5.0 + 32;

            System.out.printf("fahrenheit equivalent: %.2f%n", fahrenheit);
            System.out.print("want to repeat (y/n)? ");
            resp = sc.next().charAt(0);

        } while (resp == 'y');

        sc.close();

    }
}