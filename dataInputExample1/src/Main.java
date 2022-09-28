import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // creating the Scanner object
        Scanner sc = new Scanner(System.in);

        // var declaration
        String word;

        // reading data input
        word = sc.next();

        // data output
        System.out.println("You type: " + word);

        // terminate data entry
        sc.close();

    }
}