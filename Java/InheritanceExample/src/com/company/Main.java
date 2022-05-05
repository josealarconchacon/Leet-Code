package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a default Vehicle
	    Vehicle V = new Vehicle();
        System.out.println("V: " + V.toString());

        Vehicle V1 = new Vehicle(211, 4, 4, "BMW", "200");
        System.out.println("V1: " + V1.toString());
        System.out.println("--------------------------------------------");
        // Create a default Vehicle
        BMWCar B = new BMWCar();
        System.out.println("B: " + B);
//        B.setMaker("BMW");
//        B.setModel("X5");
//        System.out.println("B: " + B.toString());
    }
}
