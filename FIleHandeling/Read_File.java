package FIleHandeling;

import java.io.*;
import java.util.Scanner;

public class Read_File {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Aadarsh Kunwar\\Desktop\\Books.txt");
            // fr.read();
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            fr.close();
            // System.out.println("File has been read succefully");
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }
}
