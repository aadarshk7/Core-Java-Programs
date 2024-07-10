package Interface;

class ThreadA implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                Thread.sleep(2000);
                System.out.println(i+" ");
            }
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }


}


public class Demo {
    public static void main(String[] args) {
        ThreadA ta = new ThreadA();
        Thread t = new Thread(ta);
        t.start();
    }
}
