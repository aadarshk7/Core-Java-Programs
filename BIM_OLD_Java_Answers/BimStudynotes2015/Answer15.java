package BimStudynotes2015;

interface Num {
	int add(int x, int y);

	int diff(int x, int y);

}

class Knowledge implements Num {
	@Override
	public int add(int x, int y) {
		int sum = x + y;
		System.out.println("the sum is:" + sum);
		return sum;
	}

	@Override
	public int diff(int x, int y) {
		int sub = x - y;
		System.out.println("the diff is:" + sub);
		return sub;
	}
}

public class Answer15 {
	public static void main(String[] args) {
		Num n = new Knowledge();
		n.add(10, 10);
		n.diff(10, 10);
	}
}