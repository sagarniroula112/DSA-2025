package com.ooptasks.advancedtasks;

/*
 * 9. Polymorphism with Interface:
Task: Create an interface PaymentMethod with a method processPayment(). 
Implement the interface in CreditCard, DebitCard, and PayPal classes. 
Use polymorphism to process payments through different methods.
 */

interface PaymentMethod {
    void processPayment();
}

class CreditCard implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Payment processed for credit card.");
    }
}

class DebitCard implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Payment processed for debit card.");
    }
}

class PayPal implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Payment processed for paypal.");
    }
}

public class task1 {
    public static void main(String[] args) {
        PaymentMethod cc = new CreditCard();
        cc.processPayment();

        PaymentMethod dc = new DebitCard();
        dc.processPayment();

        PaymentMethod pp = new PayPal();
        pp.processPayment();
    }
}
