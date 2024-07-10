package Basic_programs;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of each subject:");
        int java = sc.nextInt();
        int web = sc.nextInt();
        int co = sc.nextInt();
        int stat = sc.nextInt();
        int acc = sc.nextInt();
        float total = java + web + co + stat + acc;
        float percentage = total / 500 * 100;
        System.out.println("Total marks= "+total);
        System.out.println("Marks in percentage= "+percentage);
       // char grade;
        if (percentage > 90 ) {
            System.out.println("A grade");
        }
        if (percentage > 80 && percentage < 70) {
            System.out.println("B grade");
        }

    }
}