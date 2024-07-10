package FIleHandeling;
//write in a file
import java.io.FileWriter;

public class Write_File {
    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("C:\\Users\\Aadarsh Kunwar\\Desktop\\Books.txt");

            fw.write("Hello this my first file");
            fw.close();
            System.out.println("File writed succesfully");
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }
}

