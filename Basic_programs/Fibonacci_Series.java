package Basic_programs;

import java.util.Scanner;

public class Finobacci_Series {
    public static void main(String[] args) {
        int num, a = 0, b = 0, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the terms.");
        num= sc.nextInt();
        for(int i=0;i<num;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.println(a);
        }
    }
}