package com.company;

public class Main {

    public static void main(String[] args) {
        StartCalculator();
    }

    public static void StartCalculator() {
        Calculator calculator = new Calculator();
        calculator.setFirstNumber(5);
        calculator.setSecondNumber(6);
        System.out.println("The multiplication result is: " + calculator.getMultiplication());
    }
}
