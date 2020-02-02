package classes.basics;

class User {
    String name;
    String lastname;
    int age;

    static final int MIN_AGE = 18;

    User(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    User(User other) {
        name = other.name;
        lastname = other.lastname;
        age = other.age;
    }

    void introduce() {
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + lastname);
        System.out.println("Wiek: " + age);
    }

    boolean isAdult() {
        return age >= MIN_AGE;
    }
}