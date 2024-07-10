// Byte Oriented ho..

package IO_Stream_in_Java;
// Java FileOutputStream Number ko tarikaley

//Basic Demo 
import java.io.FileOutputStream;

public class FileOutputStreamExamplei {
	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("C:\\Users\\Aadarsh Kunwar\\Desktop\\subhash.txt");
			f.write(100);
			System.out.println("Finished");
		} catch (Exception e) {

		} finally {
			// f.close();
		}
	}
}