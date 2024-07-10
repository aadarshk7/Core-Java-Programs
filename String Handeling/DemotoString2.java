//This is the basic example of toString() in java.
class Student {
	String name;
	int grade;
	int age;

	Student(String name, int grade, int age) {
		this.name = name;
		this.grade = grade;
		this.age = age;
	}

	public String toString() {
		return "Hello My name is: " + name + " .Currently i am in grade: " + grade + " .I am " + this.age + "years old";
	}
}

public class DemotoString2 {
	public static void main(String[] args) {
		Student s1 = new Student("Aadarsh Kunwar", 14, 20);
		System.out.println(s1.toString());
	}

}