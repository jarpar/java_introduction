package inheritance.animal;

public class Test {
    public static void main(String[] args) {
//        Animal animal = new Animal("Andrzej", 2);
//        //animal.setName("Andrzej");
//        //animal.setAge(2);
//        animal.voice();
//        System.out.println("---------");
        Lion lion = new Lion();
        lion.setName("Leon");
        lion.setAge(3);
        lion.voice();
        lion.roar();
        System.out.println("---------");
        Horse horse = new Horse();
        horse.setName("Tomek");
        horse.setAge(4);
        horse.ride(20);
        System.out.println("---------");

        Animal animal2 = new Lion("Zdzisiek", 6);
        Animal animal3 = new Horse("Antek", 7, 9);

        //((Lion) animal2).roar(); //takie rzutowanie jest niezalecane!
        Animal[] zoo = new Animal[]{lion, horse, animal2, animal3};
        for (Animal ani : zoo) {
            ani.voice();
        }
    }
}
