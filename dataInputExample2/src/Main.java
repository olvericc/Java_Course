import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // creating the Scanner object
        Scanner sc = new Scanner(System.in);

        // var declaration
        int value;

        // reading data input
        value = sc.nextInt();

        // data output
        System.out.println("You type: " + value);

        // terminate data entry
        sc.close();
    }
}