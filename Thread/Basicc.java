package Thread;

class Java implements Runnable {


    public void run() {
        System.out.println("Hello World");
    }

    public void run2() {
        System.out.println("Hello I am aadarsh Using implements ");
    }

    public void run3() {
        System.out.println("This is 3rd method");
    }
}

public class Basicc {
    public static void main(String[] args) {
        Java j = new Java();
        Thread t = new Thread(j);
       // t.run();
        t.run();
    }
}
