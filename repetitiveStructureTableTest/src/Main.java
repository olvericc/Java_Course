import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int value1 = 0;
        int value2 = 4;

        while (value1 < 3) {
            value2 += 2;
            value1 += 1;
            System.out.println(value1 + " - " + value2);
        }

        sc.close();

    }
}