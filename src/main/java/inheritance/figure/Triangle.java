package inheritance.figure;

public class Triangle implements Figure {
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return (a * h) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", h=" + h +
                '}';
    }
}
