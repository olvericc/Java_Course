public class Main {
    public static void main(String[] args) {

        // var declaration
        double height, smallerBase, largerBase, trapezeArea;

        // data input
        height = 5.0;
        smallerBase = 6.0;
        largerBase = 8.0;

        // data processing
        trapezeArea = (smallerBase + largerBase) / 2f * height; // or use that expression = (smallerBase + largerBase) / 2.0 * height;

        // data output
        System.out.println("The trapeze area equals to: " + trapezeArea);

    }
}