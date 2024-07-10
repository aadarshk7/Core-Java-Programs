package BIM2017;

interface Shape {
	public void get_data(int l, int b);

	public void display_area();
}

class Rectangle implements Shape {

	int length, breadth, area;

	public void get_data(int l, int b) {
		//length = l;
		//breadth = b;
		area = length * breadth;
	}

	public void display_area() {
		System.out.println("The are of Rectangle is " + area);
	}
}

class Square implements Shape {
	int length, breadth, area;

	public void get_data(int l, int b) {
		//length = l;

	}

	public void display_area() {
		area = length * length;
		System.out.println("The area of Square is " + area);
	}

}

public class Answer13 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.get_data(5, 5);
		r.display_area();
		Square s = new Square();
		s.get_data(2, 2);
		s.display_area();
	}
}
