//  toCharArray()
public class toCharArray__Example {
	public static void main(String[] args) {
		String s = "aadarsh";
		try {
			
		char[] c = s.toCharArray();
		for (int i = 0; i <= s.length(); i++) {
			System.out.println(c[i]);
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
