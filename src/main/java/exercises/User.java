package exercises;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class User {
    private String name;
    private String lastname;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private User(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return name + " " + lastname;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User[] user = new User[]{

                new User("Janek", "Jankowy", 25),
                new User("Ania", "Nowak", 35),
                new User("Beata", "Kowalska", 15),
                new User("Tomek", "Mały", 30),
                new User("Julia", "Kot", 40),
                new User("Albert", "Albinos", 40)
        };


        int place = 0;
        int longest = 0;

        Double mean = 0D;
        for (
                int i = 0;
                i < user.length; i++) {
            int n = user[i].getName().length() + user[i].getLastname().length();
            mean += user[i].getAge();
            if (n > longest) {
                longest = n;
                place = i;
            }
            if (user[i].getName().charAt(0) == user[i].getLastname().charAt(0)) {
                System.out.println("User " + user[i].toString() + " has the same ID initials.");
            }

        }

        mean /= user.length;
        System.out.println("Longest ID is: " + user[place]);
        System.out.println("Mean of users age is: " + mean);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter lastname: ");
        String lastname = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        User user1 = new User(name, lastname, age) {
        };
        System.out.println("Added new user: " + user1.toString() + " " + user1.getAge());
        System.out.println("Enter birthdate YYYY-MM-DD:");
        String[] birth = scanner.nextLine().split("");
        LocalDate birthday = LocalDate.parse(scanner.nextLine());
        LocalDate now = LocalDate.now();

        System.out.println("Your age is " + Period.between(now, birthday));
    }
}
