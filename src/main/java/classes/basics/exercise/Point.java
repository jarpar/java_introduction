package classes.basics.exercise;

import java.awt.*;

public class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void coordinates() {
        System.out.println("X " + x + " Y " + y);
    }

    static double distance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + (Math.pow(point1.y - point2.y, 2)));
    }

    double distanceTo(Point other) {
        //return Math.sqrt(Math.pow(this.x - other.x, 2) + (Math.pow(this.y - other.y, 2)));
        return distance(this, other);
    }
}