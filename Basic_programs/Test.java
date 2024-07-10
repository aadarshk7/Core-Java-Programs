package Basic_programs;
 class A {
    public void f1() {
        System.out.println("A—>f1");}}

 class B extends A{
    public void f1(){
        System.out.println("B—->f1");}}

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.f1();
        b.f1();
    } }