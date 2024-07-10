package Basic_programs;

public class Shubash {
    public String name = "Chuttad";
    private int age = 20;
}

class Aadarsh extends Shubash {
    public void method() {
        System.out.println(name);
      //  System.out.println(age);   (Error aauncha kina vanda age mathi mailey private declare garechu)

    }


    public static void main(String[] args) {
        Aadarsh a = new Aadarsh();
        a.method();
    }

}