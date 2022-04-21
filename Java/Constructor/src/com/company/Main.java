package com.company;

public class Main {

    public static void main(String[] args) {
        Account bobsAccount = new Account(); // "12345", 0.00, "Bob Brown", "myemail@bob.com",
        // "(087) 123-4567");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        System.out.println("---------- VIPCustomer ---------------");
        VIPCustomer P1 = new VIPCustomer();
        System.out.println(P1.getName());

        VIPCustomer P2 = new VIPCustomer("Pablo", 50000.00);
        System.out.println(P2.getName());
        System.out.println(P2.getEmail());

        VIPCustomer P3 = new VIPCustomer("Tim", 200000.00, "tim@gmail.com");
        System.out.println(P3.getName());
        System.out.println(P3.getEmail());
    }
}
