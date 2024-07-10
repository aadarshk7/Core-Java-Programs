package Basic_programs;

import java.util.Scanner;

public class Check_Prime{

        public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number to check prime");
            int num =sc.nextInt();
            boolean prime = true;
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num%i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.println(num + " is prime.");
            else
                System.out.println(num + " is not prime.");
            }
        }
