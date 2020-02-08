/*1. Utwórz klasę punkt, posiadającą pola publiczne: double x, double y. Utwórz dwa obiekty tej klasy w funkcji main i wyświetl ich zawartość.
2. Dodaj do klasy punkt gettery (accessor) i settery (mutuator) oraz metodę statyczną double distance(Point other),
obliczającą odległość euklidesową. Wzór: sqrt((x1-x2)^2 + (y1-y2)^2)
 */
package homework.weekend02;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    static double distance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));//sqrt((x1-x2)^2 + (y1-y2)^2)
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point point1 = new Point(1.5D, 2.5D);
        Point point2 = new Point(3.5D, 4.5D);
        System.out.println("Distance between " + point1.toString() + " and " + point2.toString() + " is: " + distance(point1, point2));
    }
}
