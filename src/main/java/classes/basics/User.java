package classes.basics;

public class User {
    String name;
    String lastname;
    int age;

    static final int MIN_AGE = 18;

    public User(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    User(User other) {
        name = other.name;
        lastname = other.lastname;
        age = other.age;
    }

    public void introduce() {
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + lastname);
        System.out.println("Wiek: " + age);
    }

    boolean isAdult() {
        return age >= MIN_AGE;
    }
}