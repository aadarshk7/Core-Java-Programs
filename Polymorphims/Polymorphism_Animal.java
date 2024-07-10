package Polymorphims;

class Food {
    public void Fruits() {
        System.out.println("This is main method");
    }
}

class Momos extends Food {
    public void Fruits() {
        System.out.println("Momos are tasty");
    }
}

class Rice extends Food {
    public void Fruits() {
        System.out.println("Rice is daily needs");
    }
}

class Daal extends Food {
    public void Fruits() {
        System.out.println("Daal is Nepali's best food");
    }
}


public class Polymorphism_Animal {
    public static void main(String[] args) {
        Food f = new Food();
        Food f1 = new Momos();
        Food f2 = new Rice();
        Food f3 = new Daal();
        f.Fruits();
        f1.Fruits();
        f2.Fruits();
        f3.Fruits();

        // f.Fruits();


    }
}

