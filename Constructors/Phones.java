package Constructors;

public class Phones {
    private String company;
    private float price;
    private boolean WaterProof;
    private int backup;

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return this.company;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    public void setWaterProof(boolean Waterproof) {
        this.WaterProof = Waterproof;
    }

    public boolean isWaterProof() {
        return this.WaterProof;
    }

    public void setBackup(int backup) {
        this.backup = backup;
    }

    public int getBackup() {
        return this.backup;
    }

    public void display() {
        System.out.println("The company is " + getCompany());
        System.out.println("Price is " + getPrice());
        System.out.println("Is WaterProof is " + isWaterProof());
        System.out.println("Backup " + getBackup());
    }

}

