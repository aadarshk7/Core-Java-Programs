//Byte Oriented ho..

package IO_Stream_in_Java;

import java.io.FileOutputStream;

public class FileOutputStreamExampleS {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream(
					"C:\\Users\\Aadarsh Kunwar\\Desktop\\subash");
			String s = "HEllo I am Aadarsh Kunwar";
			byte a[] = s.getBytes();// converting string into byte array
			fout.write(a);
			System.out.println("I have did it");
		} catch (Exception e) {

		}
	}
}
