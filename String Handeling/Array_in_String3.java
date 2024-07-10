
public class Array_in_String3 {
	public static void main(String[] args) {
		byte ascii[] = { 97, 98, 99, 100, 101 };
		String aadarsh = new String(ascii);
		System.out.println(aadarsh); // abcde
		String aadarsh1 = new String(ascii, 1, 2);
		System.out.println(aadarsh1); // bc
		System.out.println(aadarsh1 + " " + "\n" + aadarsh1); // bc //bc
	}
}
  