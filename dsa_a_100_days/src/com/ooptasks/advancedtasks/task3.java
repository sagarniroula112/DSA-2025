package com.ooptasks.advancedtasks;

import java.util.Arrays;
import java.util.List;

/*
 * 11. Complex Inheritance Hierarchy:
Task: Create a class hierarchy for an online shopping system. 
Start with an abstract class Product and extend it to create specific product types like 
Clothing, Electronics, and Food. Each subclass should have a method applyDiscount(). 
Create a ShoppingCart class that holds a list of products and calculates the total price.
 */

abstract class Product {
    double price;
    abstract void applyDiscount();
}

class Clothing extends Product {
    @Override
    public void applyDiscount() {
        this.price = this.price * 0.85;
    }
}

class Electronics extends Product {
    @Override
    public void applyDiscount() {
        this.price = this.price * 0.90;
    }
}

class Food extends Product {
    @Override
    public void applyDiscount() {
        this.price = this.price * 0.95;
    }
}

class ShoppingCart {
    List<Product> products;
    double totalPrice = 0;

    public void calculateTotal() {
        for (Product product : products) {
            this.totalPrice += product.price;
        }
    }
}

public class task3 {
    public static void main(String[] args) {
        Product cp = new Clothing();
        cp.price = 100;

        Product ep = new Electronics();
        ep.price = 50;

        Product fp = new Food();
        fp.price = 30;

        cp.applyDiscount();
        ep.applyDiscount();
        fp.applyDiscount();

        List<Product> products = Arrays.asList(cp, ep, fp);

        ShoppingCart sc = new ShoppingCart();
        sc.products = products;
        sc.calculateTotal();
        System.out.println(sc.totalPrice);
    }
}
