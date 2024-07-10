package FIleHandeling;

import java.io.*;

//code to create a new file
public class Create_File {
    public static void main(String[] args) {
        try {

            File f = new File("C:\\Users\\Aadarsh Kunwar\\Desktop\\Books.txt");
            if (f.createNewFile()) {
                System.out.println("FIle is created");
            }
        }catch (IOException ioe){
            System.out.println(ioe);
        }
    }
}
