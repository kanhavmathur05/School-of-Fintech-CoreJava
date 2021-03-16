package DesignPatterns.shoppingProject.model;

public class Product {
    private int pId;
    private String pName;
    private int pPrice;

    public int getpId() {
        return pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public int getpPrice() {
        return pPrice;
    }

    public Product(int pId, String pName, int pPrice) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
    }

    @Override
    public String toString() {
        return "Product[" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pPrice=" + pPrice +
                ']';
    }
}
