package Polymorphims;


class AnimaL {
    public void eat() {
        System.out.println("Animal can eat veg and non-veg");
    }
}
class caT extends AnimaL {
    public void eat() {
        System.out.println("Cat can eat both milk and meat");
    }
}

class Lion extends AnimaL {
    public void eat() {
        System.out.println("Lion doesn't eat milk");
    }

}

public class MAnyforms {
    public static void main(String[] args) {
        AnimaL a = new AnimaL();
        AnimaL b=new caT();
        //Animal arkoclass=new Dog();
        AnimaL d=new Lion();
        a.eat();
        b.eat();
        //  arkoclass.age();
        d.eat();
    }
}




