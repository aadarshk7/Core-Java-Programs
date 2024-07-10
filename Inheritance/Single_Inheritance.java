package Inheritance;

// This is the example of Single Inheritance
class A {
    void eat() {
        System.out.println("Dogs eat meat");
    }
}

class B extends A {
    void eat() {
        System.out.println("Dogs also eat Rice");
    }
}
class C extends B{
    void eat(){
        System.out.println("Dogs are good animals");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        A a1 = new A();
        a1.eat();
        B b1 = new B();
        b1.eat();
        C c1= new C();
        c1.eat();

    }

}

/*class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

class TestInheritance {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}  */
