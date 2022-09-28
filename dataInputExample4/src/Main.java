import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // set Locale import
        Locale.setDefault(Locale.US);

        // creating the Scanner object
        Scanner sc = new Scanner(System.in);

        // var declaration
        char letter;

        // reading data input
        letter = sc.next().charAt(0);

        // data output
        System.out.println("You type: " + letter);

        // terminate data entry
        sc.close();

    }
}