package classes;

public class Test {
    public static void main(String[] args) {
        User jarek = new User();
        jarek.name = "Jarosław";
        jarek.lastname = "Partyka";
        jarek.age = 30;

        System.out.println(jarek.name + " " + jarek.lastname + " " + jarek.age);

        User test = new User();
        System.out.println(test.name + test.lastname + test.age);
    }
}
