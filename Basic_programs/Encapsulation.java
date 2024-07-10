package Encapsulation;

class Student {
    private String name;
    private int age;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    public int getMarks(){
        return this.marks;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Aadarsh");
        s.setAge(20);
        s.setMarks(199);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getMarks());
    }
}

