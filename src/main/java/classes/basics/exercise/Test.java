package classes.basics.exercise;

import classes.basics.User;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(3.0D, 1.0D);
        Point point2 = new Point(4.0D, 7.0D);

        double distance = Point.distance(point1, point2);
        System.out.println(distance);

        distance = point1.distanceTo(point2);
        System.out.println(distance);

        distance = point2.distanceTo(point1);
        System.out.println(distance);

        PointCollection pointCollection = new PointCollection();
        //pointCollection.addPoints(point1);
        pointCollection.addPoints(point1, point2);
        //pointCollection.addPoints(new Point[]{point1, point2});
        pointCollection.addPoints(new Point(5.0D, 8.0D));
        pointCollection.addPoints(new Point(13.0D, 17.0D));
        pointCollection.addPoints(new Point(30.0D, 22.0D));
        pointCollection.addPoints(new Point(43.0D, 47.0D));
        pointCollection.printAllPoints();

        User user = new User("Janek", "Kowalski", 23);
        user.introduce();
        user.name = "Andrzej";
        user.introduce();
        point1.coordinates();
        System.out.println("------------------------------------------------");
        pointCollection.printAllPoints();
        pointCollection.printStats();
    }
}