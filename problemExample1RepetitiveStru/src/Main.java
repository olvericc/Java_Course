import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int sum = 0;

        while (value != 0) {
            sum += value;
            value = sc.nextInt();
        }

        System.out.println("Sum: " + sum);

        sc.close();

    }
}