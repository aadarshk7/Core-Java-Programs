
public class Array_in_length {
	public static void main(String[] args) {
		try {
		char characters[] = { 'a', 'a', 'd', 'a', 'r', 's', 'h' };
		String Aadarsh = new String(characters ,2,5);
		System.out.println(Aadarsh);
		}
		catch(Exception e) {
			System.out.println("E- occur");
		}
		
		String name = "Aadarsh";
		String name2 = "Aadarshkunwar";
		String name3 = new String(name2);
		System.out.println(name3);

		System.out.println(name.length());
		System.out.println(name.charAt(6));
		System.out.println(name2.charAt(7));

	}
}
