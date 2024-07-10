package Polymorphims;

public class Dog extends Animal {
    private String name;

    public void name() {
        System.out.println("Puntey");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
