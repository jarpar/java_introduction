package classes.basics.exercise;

public class PointCollection {
    Point[] points = new Point[100];
    int pointNumber = 0;

    void addPoints(Point... points) {
        for (Point newPoint : points) {
            this.points[pointNumber] = newPoint;
            pointNumber++;
        }
    }

    //wypisz wszystkie elementy tablicy this.points od 0 do (this.pointNumber -1):

    void printAllPoints(Point... points) {
        for (int i = 0; i < pointNumber; i++) {
            printPoint(this.points[i]);
        }
    }

    void printPoint(Point point) {
        System.out.println("Point(x: " + point.getX() + ", y: " + point.getY() + ")");
    }

    public void printStats() {
        //wypisz najmiejszy, największy i średni dystans między punktami
        //tip: nie porównuj punktu samego ze sobą
        double min = Double.MAX_VALUE;
        double mid;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < pointNumber; i++) {
            Point point1 = points[i];
            for (int j = 0; j < pointNumber; j++) {
                Point point2 = points[j];
                if (point1 == point2) {
                    continue;
                }

                double distance = point1.distanceTo(point2);
                if (distance < min) {
                    min = distance;
                }
                if (distance > max) {
                    max = distance;
                }
            }
        }
        System.out.println("min:" + min);
        System.out.println("max: " + max);
    }
}