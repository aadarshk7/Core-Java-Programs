package BIM2018;

import java.util.Scanner;

public class Answer14 {
	public static void main(String[] args) {
		System.out.println("Enter the size of array: ");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		//int a = new Scanner(System.in).nextInt();

		String s[] = new String[a];
		System.out.println("Enter " + a + " String");
		for (int i = 0; i < a; i++) {
			Scanner scc=new Scanner(System.in);
			s[i]=scc.nextLine();
			//s[i] = new Scanner(System.in).next();

		}
		for (int i = 0; i < a; i++) {
			s[i] = s[i].replace('i', '!');
		}
		System.out.println("After replace \n \n");
		for (int i = 0; i < a; i++) {
			System.out.println(s[i]);
		}
	}
}
