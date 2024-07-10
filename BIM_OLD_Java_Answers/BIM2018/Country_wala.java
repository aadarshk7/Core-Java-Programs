package BIM2018;

import java.util.Scanner;

public class Country_wala {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String name[]= sc.nextLine();
		String name[] = { "Nepal", "India", "China", "Bhutan", "Malasiya", "Dubai", "USA" };
		for (int i = 0; i < 7; i++) {
			// name[i] = name[i].replace('i', '!');
			// name[i]=name[i].replace('a','b');
			name[i] = name[i].toUpperCase();
			System.out.println(name[i]);
		}

	}
}
