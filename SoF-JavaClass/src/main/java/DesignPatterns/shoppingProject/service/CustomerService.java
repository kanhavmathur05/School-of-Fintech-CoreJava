package DesignPatterns.shoppingProject.service;

import DesignPatterns.shoppingProject.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CustomerService implements CustomerServiceInterface {

    private static int count;
    private final int tId;

    private ArrayList<Product> cart = new ArrayList<Product>();
    private Map<Integer,Double> sMap = new HashMap<Integer, Double>();

    static {
        count=0;
    }

    public CustomerService() {
        this.tId = count++;
    }

    public void addToCart(int pId, int qty, ProductService psob) {
        Product product = psob.getProduct(pId);
        cart.add(product);
        sMap.put(product.getpId(), (double) (product.getpPrice()*qty));
    }

    public String Billing() {
        double totalAmount = 0;

        for(Integer i :sMap.keySet())
        {
            totalAmount+=sMap.get(i);
        }
        return "Transaction Id: "+tId+" Billing Amount "+totalAmount;
    }
}
