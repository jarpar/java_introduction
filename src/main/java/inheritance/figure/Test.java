package inheritance.figure;

public class Test {
    public static void main(String[] args) {
/*
        Circle circle = new Circle(2);
        System.out.println(circle.toString() + " Area: " + circle.area());
        Square square = new Square(5);
        System.out.println(square.toString() + " Area: " + square.area());
        Triangle triangle = new Triangle(3, 2);
        System.out.println(triangle.toString() + " Area: " + triangle.area());
*/

        Figure[] figures = new Figure[]{
                new Circle(4.5D),
                new Square(5.6D),
                new Triangle(3.4D, 5.5D),
                new Circle(6.7D),
                new Circle(2.2D)
        };
        double sum = 0;
        for (Figure fig : figures) {
            System.out.println(fig.toString() + " Area: " + fig.area());
            sum += fig.area();
        }
        System.out.println("Total areas: " + sum);
    }
}
