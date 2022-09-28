import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // set Locale import
        Locale.setDefault(Locale.US);

        // creating the Scanner object
        Scanner sc = new Scanner(System.in);

        // var declaration
        int x;
        String text1,text2, text3;

        // reading data input
        x = sc.nextInt();
        sc.nextLine(); // consuming line break
        text1 = sc.nextLine();
        text2 = sc.nextLine();
        text3 = sc.nextLine();

        // data output
        System.out.println("Typed data:");
        System.out.println(x);
        System.out.println("You type: " + text1);
        System.out.println("You type: " + text2);
        System.out.println("You type: " + text3);

        // terminate data entry
        sc.close();

    }
}