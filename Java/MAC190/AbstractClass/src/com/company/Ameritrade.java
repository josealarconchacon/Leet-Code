package com.company;

/*
 * Design a class Ameritrade to be a Broker. Implement the methods buy and sell so that
 * only stocks can be bought and add 10 cents per share for the price as fees.
 * If not a stock then throw an exception with message "can only buy and sell stocks".
 *
 */

public class Ameritrade extends Broker {


    @Override
    void Buy(String ticker, String type, double shares, double price) throws Exception{
        if(type.equals("STK")) {
            System.out.println("Buying: " + ticker + " Type: " + type + " shares: " + shares + " for the total of: " + (shares * price + .10));
        } else {
            throw new Exception("It can only trade stokes");
        }
    }

    @Override
    void Sell(String ticker, String type, double shares, double price) throws Exception {
        if(type.equals("STK")) {
            System.out.println("Buying: " + ticker + " Type: " + type + " shares: " + shares + " for the total of: " + (shares * price - .10));
        } else {
            throw new Exception("It can only trade stokes");
        }
    }
}
