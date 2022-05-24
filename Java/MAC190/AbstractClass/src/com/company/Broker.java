package com.company;

/*
 * Design an abstract class Broker that has the following:
 * Ticker the name of a stock. null if no order (no position)
 * Type: "STK" for stocks, "CUR" for currencies, ....
 * Shares: number of shares
 * Price: the average buying price.
 * setters and getters for everyone
 * abstract method buy that accepts all the required parameters
 * abstract method sell that requires as well all parameters.
 */

abstract public class Broker {
    private String Ticker;
    private String Type;
    private double Shares;
    private double Price;

    // Abstract Method
    abstract void Buy(String ticker, String type, double shares, double price) throws Exception;
    abstract void Sell(String ticker, String type, double shares, double price)throws Exception;

    public String getTicker() {
        return Ticker;
    }

    public void setTicker(String ticker) {
        this.Ticker = ticker;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        this.Type = type;
    }

    public double getShares() {
        return Shares;
    }

    public void setShares(double sares) {
        this.Shares = sares;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }
}
