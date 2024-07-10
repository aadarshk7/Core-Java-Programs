package BIM2018;

import java.util.Scanner;

abstract class Fmachine {

	abstract void putdata(int c, String n, int ca);

	abstract void getdata();
}

class Airoplane extends Fmachine {
	int code;
	String name;
	int capacity;

	public void putdata(int c, String n, int ca) {
		code = c;
		name = n;
		capacity = ca;
	}

	public void getdata() {
		System.out.println("\n Code= " + code + "\n Name= " + name + "\n Capacity= " + capacity);

	}
}

public class Answer13 {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);

		Fmachine ar = new Airoplane();
		//System.out.println("Enter the informations");
		//ar.putdata(sc.nextInt(), sc.nextLine(), sc.nextInt());
		//ar.getdata();
		 ar.putdata(222, "Aadarsh Kunwar Flights", 2500);
		 ar.getdata();
	}
}
