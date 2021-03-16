package DesignPatterns.shoppingProject;

import DesignPatterns.shoppingProject.model.Product;
import DesignPatterns.shoppingProject.service.CustomerService;
import DesignPatterns.shoppingProject.service.ProductService;

import java.util.ArrayList;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService psob = new ProductService();
        CustomerService csob = new CustomerService();
        while (true) {
            System.out.println("1.Admin: Add Product");
            System.out.println("2.Admin/Cust Get All Products");
            System.out.println("3.Admin/Cust get a product by id");
            System.out.println("4.Admin Update a product price");
            System.out.println("5.Cust Add to cart");
            System.out.println("6. Cust Billing the customer");
            System.out.println("7. Exit");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Product ID");
                    int pId = sc.nextInt();
                    System.out.println("Enter Product Name");
                    String pName = sc.next();
                    System.out.println("Enter price");
                    int price = sc.nextInt();
                    System.out.println(psob.addProduct(pId, pName, price));
                    break;

                case 2:
                    ArrayList<Product> plist = psob.getAllProducts();
                    for (Product p : plist) {
                        System.out.println(p);
                    }
                    break;

                case 3:

                    System.out.println("Enter productId:");
                    int productId = sc.nextInt();
                    Product p = psob.getProduct(productId);
                    if (p != null) {
                        System.out.println(p);
                    } else {
                        System.out.println("Product Not Found");
                    }
                    break;

                case 4:
                    System.out.println("Enter ID of Product:");
                    int productsId= sc.nextInt();
                    System.out.println("Enter product price");
                    int updatedPrice=sc.nextInt();
                    psob.updateProductPrice(productsId,updatedPrice);
                    break;

                case 5:
                    System.out.println("Enter product ID to be added in cart:");
                    int proId=sc.nextInt();
                    System.out.println("Enter the quantity");
                    int qty=sc.nextInt();
                    csob.addToCart(proId,qty,psob);
                    System.out.println("Product Added to cart");
                    break;

                case 6:
                    System.out.println("Billing");
                    System.out.println(csob.Billing());
                    break;

                default:
                    System.out.println("Bye Bye");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
