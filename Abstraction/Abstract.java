abstract class Mammels {
	abstract public void we();
}

public class Abstract extends Mammels {
	public void we() {
		System.out.println("Humans are Mammels");
	}

	public static void main(String[] args) {
		Mammels m = new Abstract();
		m.we();
	}

}
