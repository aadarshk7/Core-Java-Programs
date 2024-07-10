package BimStudynotes2016;

public class Answer14 {
	public static void main(String[] args) {
		 String name[] = { "Aadarsht", "Abhishekt", "Apekshyat", "Arbindrat", };
		for (int i = 0; i < name.length; i++) {
			if (name[i].contains("t")) {
				System.out.println(name[i]);
			}
		}
	}
}
