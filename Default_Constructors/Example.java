package Default_Constructors;

public class Example {
    Example() { //default constructor
        System.out.println("This is default constructor");
    }

    Example(int i, int j) {//parameterized constructor
        System.out.println("Constructor with two parameters");
    }
    public void total(){
        System.out.println("total= ");
    }

    public static void main(String[] args) {
        Example e = new Example();
 
        Example e1 = new Example(2,3);
        e1.total();
    }
}
