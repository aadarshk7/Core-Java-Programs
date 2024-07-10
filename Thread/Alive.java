package Thread;

public class Alive extends Thread {
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("Hello");
        } catch (Exception e) {
            System.out.println(" .aaaaaaaaa ");
        }
    }

    public static void main(String[] args) {
        Alive a = new Alive();
        System.out.println(a.isAlive());
        a.start();
        System.out.println(a.isAlive());
    }
}
