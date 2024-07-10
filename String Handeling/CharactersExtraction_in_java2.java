//to Byte array
public class CharactersExtraction_in_java2 {
	public static void main(String[] args) {
		String akc = "Hello";
		byte[] byteArray = akc.getBytes();
		System.out.println("byteArray of Hello" + "=" + byteArray);
		for (byte b : byteArray) {
			System.out.println(b);
		}
	}
}