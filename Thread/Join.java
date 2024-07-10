package Thread;

public class Join extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000);
                System.out.println("aadarshkunwar.com.np");
            }
        } catch (InterruptedException ie) {

        }
    }

    public static void main(String[] args) {
        Join j = new Join();
        Join j2 = new Join();
        Join j3 = new Join();
        j.start();
        try {
            j.join(1500);
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            System.out.println("Hello this is my website");
        }
        j2.start();
        j3.start();
    }
}
