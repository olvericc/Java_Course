import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double price;

        // ERROR: variable price may not have been initialized
        // System.out.println("Price: U$ " + price);

        price = 200.00;

        if (price < 200.00) {
            double discount = price * 0.1;
        }

        // ERROR: variable discount is out of scope if
        // System.out.printf("Discount: %.2f%n", discount);

        /*
        * the best solution
        * double price = 500.00;
        * double discount = 0;
        *
        * if (price < 200.00) {
        *   discount = price * 0.1;
        * }
        *
        * System.out.printf("Discount: %.2f%n", discount);
        * */

    }
}