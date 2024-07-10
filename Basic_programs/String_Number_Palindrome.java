package Basic_programs;
import java.util.Scanner;

public class String_Number_Palindrome {

        public static void main (String[] args) {
            String str, reverse = "";
            Scanner in = new Scanner(System.in);
            int length;
            System.out.println("Enter the number or String");
            str = in.nextLine();
            length = str.length();
            for (int i =length -1; i>=0; i--) {
                reverse = reverse + str.charAt(i);
            }
            System.out.println("reverse is:" +reverse);

            if(str.equals(reverse))
                System.out.println("The number is palindrome");
            else
                System.out.println("The number is not a palindrome");

        }
    }
