import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // set Locale import
        Locale.setDefault(Locale.US);

        // creating the Scanner object
        Scanner sc = new Scanner(System.in);

        // var declaration
        String var1;
        int var2;
        double var3;

        // reading data input
        var1 = sc.next();
        var2 = sc.nextInt();
        var3 = sc.nextDouble();

        // data output
        System.out.println("Typed data:");
        System.out.println("You type: " + var1);
        System.out.println("You type: " + var2);
        System.out.println("You type: " + var3);

        // terminate data entry
        sc.close();
    }
}