package classes;

public class Test {
    public static void main(String[] args) {
        User jarek = new User();
        jarek.name = "Jarosław";
        jarek.lastname = "Partyka";
        jarek.age = 30;

        System.out.println(jarek.name + " " + jarek.lastname + " " + jarek.age);
        System.out.println();

        User test = new User();
        System.out.println(test.name + " " + test.lastname + " " + test.age);
        System.out.println();

        jarek.introduce();
        System.out.println();
        test.introduce();
    }
}
