package com.company;

/*
 * Design a class Oanda to be a Broker. Implement the methods buy and sell so that
 * only currencies can be bought and add 0.05 cents per share for the price as fees.
 * If not currency throw and exception with message "only currencies can be traded".
 *
 */

public class Oanda extends Broker{
    @Override
    void Buy(String ticker, String type, double shares, double price) throws Exception {
        if(type.equals("CUR")) {
            System.out.println("Buying: " + ticker + " Type: " + type + " shares: " + shares + " for the total of: " + (shares * (price + .050)));
        } else {
            throw new Exception("It can only trade Currencies");
        }
    }

    @Override
    void Sell(String ticker, String type, double shares, double price) throws Exception {
        if(type.equals("CUR")) {
            System.out.println("Buying: " + ticker + " Type: " + type + " shares: " + shares + " for the total of: " + (shares * (price - .050)));
        } else {
            throw new Exception("It can only trade Currencies");
        }
    }
}
