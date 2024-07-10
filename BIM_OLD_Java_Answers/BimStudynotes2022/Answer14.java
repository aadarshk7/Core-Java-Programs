package BimStudynotes2022;

class Threadd implements Runnable {
	public void run() {
		for (int i = 100; i <= 200; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				try {
					Thread.sleep(1500);
					
				} catch (Exception ex) {
					System.out.println("exception");
				}
			}
		}
	}
}

public class Answer14 {
	public static void main(String[] args) {
      Threadd t1=new Threadd();
      Thread tt1=new Thread(t1);
      tt1.start();
      
	}
}

