package IO_Stream_in_Java;

import java.io.FileInputStream;

public class FileInputStreami {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream(
					"C:\\Users\\Aadarsh Kunwar\\Desktop\\subhash.txt");
			int i = fin.read();
			System.out.print((char) i);

			fin.close();
		} catch (Exception e) {
			System.out.println("e");
		}
	}

}