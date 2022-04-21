package com.company;

public class Account {
    private String Number;
    private double Balance;
    private String CustomerName;
    private String CustomerEmailAddress;
    private String CustomerPhoneNumber;

    public Account() {
        this("56789", 2.50, "Default name", "Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress,
                   String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.Number = number;
        this.Balance = balance;
        this.CustomerName = customerName;
        this.CustomerEmailAddress = customerEmailAddress;
        this.CustomerPhoneNumber = customerPhoneNumber;
    }
    // allow the customer to deposit funds (this should increment the balance field).
    public void deposit(double depositAmount) {
        this.Balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.Balance);
    }
    // To allow the customer to withdraw funds. This should deduct from the balance field
    public void withdrawal(double withdrawalAmount) {
        if(this.Balance - withdrawalAmount <= 0) {
            System.out.println("Only " + this.Balance + " available. Withdrawal not processed");
        } else {
            this.Balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed, Remaining balance = " + this.Balance);
        }
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        this.Number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return CustomerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.CustomerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return CustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.CustomerPhoneNumber = customerPhoneNumber;
    }
}
