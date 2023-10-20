package org.lessons.java.shop;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(7134591, "Smartphone", "Galaxy 21+ ultra", 700.00));
        products.add(new Product(2245, "PC", "Apple Laptop", 2000.00, 0.10));
        products.add(new Product(45, "PC", "Asus Laptop", 1200.00));
        products.add(new Product(157, "Smartphone", "Iphone 15 Pro", 3000.00, 0.46));

        for (Product product : products) {
            System.out.println(product + " " + " " + "\n");
        }
    }
}
