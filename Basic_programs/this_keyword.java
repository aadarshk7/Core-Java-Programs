
public class this_keyword {
	int a;

	public this_keyword(int a) {
		this.a = a;

	}

	public static void main(String[] args) {
		this_keyword k = new this_keyword(5);
		System.out.println(k.a);
	}
}
