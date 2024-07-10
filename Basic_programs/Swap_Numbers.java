package Basic_programs;

import java.util.Scanner;

public class Swap_Numbers {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to swapping...");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Before swapping "+a+" and "+b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping "+a+" and "+b);

    }
}
