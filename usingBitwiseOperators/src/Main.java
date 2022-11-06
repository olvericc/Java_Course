import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("please, type any number: ");
        int var = sc.nextInt();

        // creating a mask
        int mask = 0b00100000; // or use the decimal number 32

        // testing if the sixth bit equals to 1 or 0

        if ((var & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }

        sc.close();

    }
}