package com.webdevbymarcus;

public class Main {

    public static void main(String[] args) {

        Account acct1 = new Account(3234, 593.32, "Jason", "jason@gmail.com", 2142345932);

        System.out.println("------ Original Balance ------");

        System.out.println(acct1.balance);

        System.out.println("------ deposit ------");

        acct1.deposit(1000);

        System.out.println("------ withdraw ------");

        acct1.withdraw(500);


    }
}
