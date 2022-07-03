package com.webdevbymarcus;

public class Account {

    int accountNumber;
    double balance;
    String customerName;
    String customerEmail;
    int customerPhoneNumber;



    public void deposit(double depo){

        this.balance += depo;

        System.out.println("You deposited " + "$" + depo);
        System.out.println("Your new account balance is " + balance);
        System.out.println("Thank you " + customerName + "!");

    }

    public void withdraw(double withdraw){

        if(withdraw > balance){
            System.out.println("Not enough funds in your balance to complete this transaction");
            System.out.println("Your balance is " + balance);
        } else{
            this.balance -= withdraw;

            System.out.println("You withdrew " + "$" + withdraw);
            System.out.println("Your new account balance is " + balance);
            System.out.println("Thank you " + customerName + "!");

        }

    }

    public Account(int accountNumber, double balance, String customerName, String customerEmail, int customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
