package inheritance.animal;

public abstract class Animal {//abstract oznacza,że nie można utworzyć obiektu tej klasy
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {

    }

    public abstract void voice();//abstract wymaga override

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
