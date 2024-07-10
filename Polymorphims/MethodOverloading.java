package Polymorphims;
//Method overloading
class Multiply {
    public void multiply() {
        int a = 10;
        int b = 10;
        int c;
        c = a * b;
        System.out.println("c = " + c);
    }

     void multiply(int w, int y, int z) {  //Parameter ma kunai value pathauna paidaina
        z = w * y;
        System.out.println("z = " + z);
    }

    public void multiply(int p, float q) {
        float r;
        r = p * q;
        System.out.println("r = " + r);
    }

    public void multiply(double m, double n) {
       double o= m*n;
        System.out.println("o = " + o);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Multiply m = new Multiply();
        m.multiply();   // 100
        m.multiply(2,2, 0);  //4 because the value of z is used to multiply w and y
        m.multiply(10, 20); //200;
        m.multiply(2.00,2.00); //4.0


    }
}
