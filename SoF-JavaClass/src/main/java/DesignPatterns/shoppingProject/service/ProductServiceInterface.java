package DesignPatterns.shoppingProject.service;

import DesignPatterns.shoppingProject.model.Product;

import java.util.ArrayList;

public interface ProductServiceInterface {

    String addProduct(int pId, String pName, int pPrice);
    ArrayList<Product> getAllProducts();
    Product getProduct(int pId);
    String updateProductPrice(int pId,int pPrice);
}
