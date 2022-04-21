package com.company;

public class VIPCustomer {
    private String Name;
    private Double CreditLimit;
    private String Email;

    public VIPCustomer() {
        this("Default Name", 150000.00, "default@gmail.com");
    }

    public VIPCustomer(String name, Double creditLimit) {
        this(name, creditLimit, "unknownemail@gmail.com");
    }

    public VIPCustomer(String name, Double creditLimit, String email) {
        this.Name = name;
        this.CreditLimit = creditLimit;
        this.Email = email;
    }

    public String getName() {
        return Name;
    }

    public Double getCreditLimit() {
        return CreditLimit;
    }

    public String getEmail() {
        return Email;
    }
}
