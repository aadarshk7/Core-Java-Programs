//  getChars()
public class getChars__Example {
	public static void main(String[] args) {
		String name = "Aadarsh Kunwar";
		char c[]=new char[7];
		try {
			name.getChars(0,1,c,0);
			name.getChars(0, 7, c, 0);
			System.out.println(c);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
