import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        double x = 10.35784;

        // without decimal places
        System.out.println(x);

        // two decimal places
        System.out.printf("%.2f%n", x);

        // four decimal places
        System.out.printf("%.4f%n", x);

        // using dots instead of commas
        Locale.setDefault(Locale.US);

        System.out.printf("%.4f%n", x);

        //camelCase
        int firstElement = 4;
        int secondElement = 8;

        // using concatenation with println
        System.out.println("My first element is: " + firstElement
        + " and my second element is: " + secondElement);

        // using concatenation with printf
        System.out.printf("My variable x is: %.2f%n", x);

        // using various elements with printf

        // var declaration
        String name = "Maria";
        int age = 20;
        double income = 4500.00;

        /*
        * %f = double
        * %d = int
        * %s = string
        * %n = break line
        * */

        System.out.printf("%s has %d years old and earn U$ %.2f%n", name, age, income);
    }

}