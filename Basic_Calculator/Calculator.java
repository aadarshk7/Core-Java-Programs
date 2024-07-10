package Calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operations");
		System.out.println("1 for add");
		System.out.println("2 for diffference/subtract");
		int a, b;
		//mula
		// int a = sc.nextInt();
		// int b = sc.nextInt();
		int n = sc.nextInt();
		switch (n) {
		case 1:
			System.out.println("Enter the numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			int sum = a + b;
			System.out.println("The sum of two numbers is " + sum);
			break;
		case 2:
			System.out.println("Enter the numbers");
			a = sc.nextInt();
			b = sc.nextInt();
			int diff = a - b;
			System.out.println("The difference of two numbers is " + diff);
		}
	}
}
