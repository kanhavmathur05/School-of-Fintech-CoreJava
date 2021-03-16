package DesignPatterns.shoppingProject.service;

import DesignPatterns.shoppingProject.model.Product;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductService implements ProductServiceInterface{

    ArrayList<Product> plist =new ArrayList<Product>();

    public String addProduct(int pId, String pName, int pPrice) {
        Product p = new Product(pId,pName,pPrice);
        plist.add(p);
        return "Product Added";
    }

    public ArrayList<Product> getAllProducts() {
        return plist;
    }

    public Product getProduct(int pId) {
        Product p = null;
        Iterator<Product> it = plist.iterator();
        while(it.hasNext())
        {
            p=it.next();

            if(p.getpId()==pId)
            {
                return p;
            }
        }
        return null;
    }

    public String updateProductPrice(int pId,int pPrice) {
        Product p=getProduct(pId);
        p.setpPrice(pPrice);
        return "Product Price Updated Successfully";
    }
}
