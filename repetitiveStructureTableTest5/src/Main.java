public class Main {
    public static void main(String[] args) {

        int x = 2;
        int y = 10;

        System.out.println("Hello");

        while ( x < y ) {
            System.out.println(x + " - "+ y);
            x *= 2;
            y += 1;
        }
    }
}