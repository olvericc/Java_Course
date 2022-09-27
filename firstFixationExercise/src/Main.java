import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // variable declaration

        String product1 = "Gamer computer";
        String product2 = "iPhone 14 Pro Max";

        int age = 20;
        long code = 74579684;
        char gender = 'M';
        double price1 = 2100.00;
        double price2 = 650.60;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is U$ %.2f%n", product1, price1);
        System.out.printf("%s, which price is U$ %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("record: %d years old, code %d and gender %s %n", age, code, gender);
        System.out.println();
        System.out.printf("measure with eight decimal places: %.8f%n", measure);
        System.out.printf("rounded (three decimal places): %.3f%n", measure);

        Locale.setDefault(Locale.US);

        System.out.printf("US decimal point: %.3f%n", measure);

    }

}