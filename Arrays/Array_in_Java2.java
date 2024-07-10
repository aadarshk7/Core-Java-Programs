package Arrays;

import java.util.Scanner;

public class Array_in_Java2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Array");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		// for input
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
			
		}
		//for output
		for(int i=0;i<size;i++) {
			System.out.println(numbers[i]);
		}
	}
}
