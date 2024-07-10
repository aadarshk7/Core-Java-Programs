package Constructors;

//THis is parameterized constructor
public class Main {

    private String name;
    private int age;
    private boolean WaterProof;

    Main(String name, int age, boolean WaterProof){
    this.name=name;
    this.age=age;
    this.WaterProof=WaterProof;
    }
public void total(){
    System.out.println("Hello brother! ");
}
    public static void main(String[] args) {
        Main m=new Main("Infinix", 2, true );
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.WaterProof);
        m.total();

    }
}

