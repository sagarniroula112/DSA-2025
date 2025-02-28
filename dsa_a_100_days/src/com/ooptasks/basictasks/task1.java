package com.ooptasks.basictasks;

/* 
 * Task: Create a Book class with private attributes: title, author, and price. 
 * Write a constructor to initialize these attributes and use getter and setter methods to access and modify the data.
 */

class Book {
    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }
    
    double getPrice() {
        return this.price;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPrice(double price) {
        this.price = price;
    }
}

public class task1 {
    
}
