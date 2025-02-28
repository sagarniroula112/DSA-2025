package com.ooptasks.advancedtasks;

/*
 * 10. Access Modifiers and Encapsulation:
Task: Create a class BankAccount with private attributes balance and accountNumber. 
Provide public getter and setter methods. 
Implement the withdrawal method where the balance cannot go below a certain limit.
 */

class BankAccount {
    private double balance;
    private long accountNumber;

    public BankAccount(double balance, long accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void withdrawal(double withdrawAmt) {
        if(balance-withdrawAmt < 100){
            System.out.println("Balance can't be less than Rs. 100.");
        }
        else{
            this.balance = balance - withdrawAmt;
            System.out.println("Withdrawal successful! New balance: " + this.balance);
        }
    }
}

public class task2 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(500, 5886);

        acc1.withdrawal(400);
    }   
}
