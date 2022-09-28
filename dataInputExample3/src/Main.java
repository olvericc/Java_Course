import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // set Locale import
        Locale.setDefault(Locale.US);

        // creating the Scanner object
        Scanner sc = new Scanner(System.in);

        // var declaration
        Double value;

        // reading data input
        value = sc.nextDouble();

        // data output
        System.out.println("You type: " + value);

        // terminate data entry
        sc.close();
    }
}