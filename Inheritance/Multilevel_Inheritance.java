package Inheritance;

// This is the example of Multi-level Inheritance
class Animal {
    public void method() {
        System.out.println("Animals are awesome");
    }
}

class Dog extends Animal {
    public void method() {
        System.out.println("Dogs are good animals");
    }
}

class Puntey extends Dog {
    public void method() {
        System.out.println("Puntey is my Dog Name");
    }
}


public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.method();
        Dog d = new Dog();
        d.method();
        Puntey p = new Puntey();
        p.method();
    }
}
