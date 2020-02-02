package classes;

public class Test {
    public static void main(String[] args) {
        String nazwisko = "Partyka";
        User jarek = new User("Jarosław", nazwisko, 30);
        jarek.name = "Jarosław";
        jarek.lastname = "Partyka";
        jarek.age = 30;

        System.out.println(jarek.name + " " + jarek.lastname + " " + jarek.age);
        System.out.println();

        jarek.introduce();

        System.out.println();

        User ania = new User("Anna", "Kowalska", 25);
        ania.introduce();
    }
}
