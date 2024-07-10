package Interface;

import java.util.Scanner;

interface hello {
    void method();

    void method2();
}

class bye implements hello {
    String name, grade;
    int age;

    public void method() {
        name="Aadarsh";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you class");
        grade = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
    }

    @Override
    public void method2() {
        System.out.println("My Name is " + name + " I am " + age + " years old " + "Currently  I am in " + grade);
    }

}

public class Aadarsh {


    public static void main(String[] args) {
        hello h = new bye();
        h.method();
        h.method2();
    }
}
