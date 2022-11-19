package entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double area () {
        double perimeter = (a + b + c) / 2.0;
        return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    }

}
