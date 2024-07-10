import java.util.Scanner;

// example of throw and throws keyword and Exception in java
public class Throw_keyword {
	public static void main(String[] args)  {
     Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		System.out.println("Enter you age");
     if (age < 20) {
			throw new ArithmeticException("You can not marry");
		} else {
			System.out.println("You can marry");
		}

	}

}
