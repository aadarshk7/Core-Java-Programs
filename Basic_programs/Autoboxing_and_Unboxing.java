//This is also Wrapper Class
public class Autoboxing_and_Unboxing {

	public static void main(String[] args) {
		int i = 150;
		Integer data = new Integer(i); // Autoboxing
		System.out.println(data);
		int j;
		j = data.intValue();
		System.out.println(j);
		// Unboxing

		// System.out.println(a);
	}

}
