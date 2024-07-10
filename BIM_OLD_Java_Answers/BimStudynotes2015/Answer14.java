package BimStudynotes2015;

class Rectangle {
	private int length;
	private int breadth;
	private int area;

	public void computeArea(int l, int b) {
		int length = l;
		int breadth = b;
		setArea(length * breadth);
	}

	public void displayArea() {
		System.out.println("Area:" + getArea());
	}

	public int getArea() {
		return this.area;
	}

	public void setArea(int area) {
		this.area = area;
	}
}

public class Answer14 extends Rectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.computeArea(10, 20);
		Rectangle r2 = new Rectangle();
		r2.computeArea(30, 40);
		if (r1.getArea() > r2.getArea()) {
			r1.displayArea();
		} else {
			r2.displayArea();
		}
	}

}
