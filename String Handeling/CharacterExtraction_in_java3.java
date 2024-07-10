
public class CharacterExtraction_in_java3 {
	public static void main(String[] args) {
		String akc = new String("Please turn me into character Array");
		char ch[] = akc.toCharArray();
		System.out.println("Returned character Array" + akc.toCharArray());
		System.out.println(ch[4]);
	}
}
