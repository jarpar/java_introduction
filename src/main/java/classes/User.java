package classes;

class User {
    String name;
    String lastname;
    int age;

    void introduce() {
        System.out.println("Imię: " + this.name);
        System.out.println("Nazwisko: " + this.lastname);
        System.out.println("Wiek: " + this.age);
    }
}
