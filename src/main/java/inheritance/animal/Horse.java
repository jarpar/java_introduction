package inheritance.animal;

public class Horse extends Animal {
    private int rating;

    public Horse(String name, int age, int rating) {
        super("Mietek", 20);
        this.rating = rating;
    }

    public Horse() {

    }

    @Override
    public void voice() {
        //super.voice();
        System.out.println("Horse " + getName() + " says: Ihahaha!");
    }

    public void ride(int speed) {
        System.out.println("Horse " + getName() + " with rating " + rating + " rides with " + speed + " km/h");
    }

}
