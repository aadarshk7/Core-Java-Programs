package BIM2017;

class Student {
	int rollno;

	public void readroll(int r) {
		rollno = r;
	}

	public void displayroll() {
		System.out.println("Roll_no is " + rollno);
	}

}

class Test extends Student {
	int java;
	int web;

	public void readmarks(int j, int w) {
		java = j;
		web = w;

	}

	public void displaymarks() {
		System.out.println("Marks of java is " + java + " and marks of web is " + web);
	}
}

class Results extends Test {
	int total;

	public void calculate() {
		total = java + web;

	}

	public void display() {
		System.out.println("The total marks of java and web are " + total);
	}
}

public class Answer12 {
	public static void main(String[] args) {
		Results result = new Results();
		result.readroll(2);
		result.displayroll();
		result.readmarks(30, 40);
		result.displaymarks();
		result.calculate();
		result.display();
	}
}
