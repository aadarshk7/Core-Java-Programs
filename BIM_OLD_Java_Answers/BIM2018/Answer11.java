package BIM2018;

import java.util.Scanner;

public class Answer11 {
	public static void main(String[] args) {
		int i,j;
		int sum =0;
		int a[][] = new int[2][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements: ");
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
				sum = sum + a[i][j];

			}
		}
		System.out.println("sum = " + sum);
	}

}
