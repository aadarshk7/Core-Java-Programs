package Parameterized_Constructor;

public class Laptop {
    private String company;
    private int generation;
    private int processor;
    private boolean BulletProof;
    private float price;

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }


    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public void setProcessor(int processor) {
        this.processor = processor;
    }

    public int getProcessor() {
        return processor;
    }

    public boolean isBulletProof() {
        return BulletProof;
    }

    public void setBulletProof(boolean bulletProof) {
        BulletProof = bulletProof;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void display() {
        System.out.println("The Company is " + getCompany());
        System.out.println("The generation is " + getGeneration());
        System.out.println("The Processor is " + getCompany());
        System.out.println("BulletProof " + isBulletProof());
        System.out.println("Price is " + getPrice());
    }
}
