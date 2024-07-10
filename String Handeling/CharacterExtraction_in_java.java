
public class CharacterExtraction_in_java {

	public static void main(String[] args) {

		String ad = new String("Hello I am Aadarsh Kunwar");
		char ch[] = new char[24];
		try {
			ad.getChars(11, 19, ch, 0);
			System.out.println(ch);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
