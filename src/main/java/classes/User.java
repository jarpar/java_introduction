package classes;

class User {
    String name;
    String lastname;
    int age;

    void introduce() {
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + lastname);
        System.out.println("Wiek: " + age);
    }

    User(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }
}
