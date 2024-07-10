package Parameterized_Constructor;

public class P_Laptop {
    private String company;
    private int generation;
    private int processor;
    private boolean BulletProof;
    private float price;

    P_Laptop(String company, int generation, int processor, boolean Bulletproof, float price) {
        this.company = company;
        this.generation = generation;
        this.processor = processor;
        this.BulletProof = Bulletproof;
        this.price = price;
    }

    public static void main(String[] args) {
        P_Laptop sc = new P_Laptop("Infinix inbookX1", 10, 5, true, 50000f);

        System.out.println(sc.company);
        System.out.println(sc.generation);
        System.out.println(sc.processor);
        System.out.println(sc.BulletProof);
        System.out.println(sc.price);
    }
}
