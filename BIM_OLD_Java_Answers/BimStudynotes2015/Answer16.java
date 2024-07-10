package BimStudynotes2015;

// An exception is a runtime and compile time problem which arises during the execution of program.
public class Answer16 {

	public static void main(String[] args) {

		try {
			try {
				int arr[] = { 2, 3, 4, 5 };
				System.out.println(arr[2]);
			} catch (StringIndexOutOfBoundsException a) {
				System.out.println(a);
			}
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("Can't divide by zero.s");
		}
		System.out.println("i love this");
	}

}
