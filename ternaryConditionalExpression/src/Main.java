import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double price = 34.5;

        // not using ternary conditional expression
        /*
        * if (price < 10.0) {
        *   discount = price * 0.1;
        * }
        * else {
        *   discount = price * 0.05;
        * }
        *
        * System.out.printf("Discount: %.1f%n", discount);
        * */

        // using ternary conditional expression
        double discount = (price < 20.0) ? price * 0.1 : price * 0.05;

        System.out.printf("Discount: %.3f%n", discount);

    }
}