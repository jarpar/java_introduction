package classes.basics;

public class Test {
    public static void main(String[] args) {
        String nazwisko = "Partyka";
        User jarek = new User("Jarosław", nazwisko, 30);
        jarek.name = "Jarosław";
        jarek.lastname = "Partyka";
        jarek.age = 30;

        System.out.println(jarek.name + " " + jarek.lastname + " " + jarek.age);
        System.out.println(jarek.isAdult());
        System.out.println();

        jarek.introduce();

        System.out.println();

        User ania = new User("Anna", "Kowalska", 17);
        ania.introduce();
        System.out.println();

        User cloneAnia = new User(ania);
        cloneAnia.introduce();
        cloneAnia.name = "Beata";
        cloneAnia.introduce();
        System.out.println(ania);
        System.out.println(cloneAnia);
        System.out.println(ania.isAdult());
        System.out.println("#### TEST WIEKU ####");
        System.out.println("Czy Ania jest dorosła? " + ania.isAdult());
        System.out.println("Czy Jarek jest dorosły? " + jarek.isAdult());
    }
}
