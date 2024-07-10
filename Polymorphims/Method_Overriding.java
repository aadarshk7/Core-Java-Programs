package Polymorphims;
// Implementing Dynamic Method Dispatch
//Dynamic polymorphisms which is also known as runtime polymorphisms

class Apple {
    void display() {
        System.out.println("Inside Apple's display method");
    }
}

class Banana extends Apple {
    void display()   // overriding display()
    {
        System.out.println("Inside Banana's display method");
    }
}

class Cherry extends Apple {
    void display()   // overriding display()
    {
        System.out.println("Inside Cherry's display method");
    }
}

class Fruits_Dispatch {
    public static void main(String args[]) {
        Apple a = new Apple();   // object of Apple
        Banana b = new Banana();  // object of Banana
        Cherry c = new Cherry();  // object of Cherry

        a.display();   // calling Apple's version of display()

        b.display();   // calling Banana's version of display()

        c.display();  // calling Cherry's version of display()
    }
}