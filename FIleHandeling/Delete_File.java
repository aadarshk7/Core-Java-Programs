package FIleHandeling;

import java.io.File;
//delete a file
public class Delete_File {
    public static void main(String[] args) {


        try {
            File fd = new File("aadarsh.txt");
            fd.delete();
            System.out.println("FIle deleted successfully");

        }catch(Exception e){
            System.out.println("Exception occured");
        }
    }
}
