package inheritance.animal;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    public Lion() {

    }

    @Override
    public void voice() {
        System.out.println("Lion " + getName() + " RRROOOAAAARR!");
    }

    public void roar() {
        //voice();
        System.out.println("Lion " + getName() + " RRROOOAAAARR!");
    }
}
