import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < number; i++) {
            int inputNumber = sc.nextInt();
            sum += inputNumber;
        }
        System.out.println(sum);

        sc.close();
    }
}