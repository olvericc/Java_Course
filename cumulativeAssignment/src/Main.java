import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int minutesConsumed = sc.nextInt();

        double account = 50.0;
        if(minutesConsumed > 100){
            account += (minutesConsumed - 100) * 2.0;
        }

        System.out.printf("Account value: U$ %.2f%n", account);

        sc.close();

    }
}