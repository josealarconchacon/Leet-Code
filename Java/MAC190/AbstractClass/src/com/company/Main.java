package com.company;
/*
    Abstract class is a class that serves as a basis for others classes
    Abstract classes cannot be instantiated, but they can be subclassed
*/
public class Main {

    public static void main(String[] args) {
	//
        Broker stockBroker = new Ameritrade();
        try {
            stockBroker.Buy("IBM", "STK", 200, 45);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("-----------------------------------------------------------");
        Broker CurrencyBroker = new Oanda();
        try {
            CurrencyBroker.Buy("EUR","CUR",1000,89.5d);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
