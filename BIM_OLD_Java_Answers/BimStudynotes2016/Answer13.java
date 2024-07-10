package BimStudynotes2016;

interface Calculate {
	int add(int x, int y);

	int diff(int x, int y);
}

class Answer13 implements Calculate {

	@Override
	public int add(int x, int y) {
		int sum = x + y;
		System.out.println(sum);
		return sum;
	}

	@Override
	public int diff(int x, int y) {
		int sub = x - y;
		System.out.println(sub);
	  return sub;
	}

	public static void main(String[] args) {
		Answer13 a = new Answer13();
		a.add(11, 11);
		a.diff(11, 11);
	}

}
