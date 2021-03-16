package DesignPatterns.shoppingProject.service;

public interface CustomerServiceInterface {
    void addToCart(int pId,int qty, ProductService psob);
    String Billing();
}
