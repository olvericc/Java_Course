import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour;

        System.out.println("what time is it?");
        hour = sc.nextInt();

        if (hour < 12) {
            System.out.println("good morning!");
        }
        else if (hour < 18){
            System.out.println("good afternoon!");
        }
        else {
            System.out.println("good night!");
        }

        sc.close();

    }
}