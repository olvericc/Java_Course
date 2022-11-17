import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Type three numbers: ");

        int firstVar = sc.nextInt();
        int secondVar = sc.nextInt();
        int thirdVar = sc.nextInt();

//        if (firstVar > secondVar && firstVar > thirdVar) {
//            System.out.println("Higher: " + firstVar);
//        }
//        else if (secondVar > thirdVar) {
//            System.out.println("Higher: " + secondVar);
//        }
//        else if (thirdVar > secondVar) {
//            System.out.println("Higher: " + thirdVar);
//        }
//        else {
//            System.out.println("ERROR");
//        }

        int higher = max(firstVar, secondVar, thirdVar);

        showResult(higher);

        sc.close();

    }

    // returns the max number
    public static Integer max(int number1, int number2, int number3){

        int localVar = 0;

        if (number1 > number2 && number1 > number3) {
            localVar = number1;
        }
        else if (number2 > number3) {
            localVar = number2;
        }
        else {
            localVar = number3;
        }

        return localVar;
    }

    // returns the result
    public static void showResult(int value) {
        System.out.println("Higher: " + value);
    }

}