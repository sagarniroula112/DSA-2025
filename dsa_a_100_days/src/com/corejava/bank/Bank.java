package com.corejava.bank;

import java.util.*;

class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

// public -> can be accessed from anywhere — within the class, package, or even outside the package
// default -> accessible only within the same package
// protected -> only subclasses may access in other packages
// private -> only accessed by getters and setters, accessible only within the class

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Apna COllege";
        acc1.email = "apnacollege@gmail.com";
        acc1.setPassword("abcd");
        System.out.println(acc1.getPassword());
    }
}
