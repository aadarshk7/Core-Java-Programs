package BimStudynotes2015;

class Threadnumber implements Runnable {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {

			}
			
		}
	}
}

public class Answer12 {
	public static void main(String[] args) {
		Threadnumber tn = new Threadnumber();
		Thread tn1 = new Thread(tn);
		tn1.start();
	}
}