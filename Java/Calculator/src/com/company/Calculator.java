package com.company;

public class Calculator {
    private double firstNumber, secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    // return the addition of the fields value of firstNumber and secondNumber
    public double getAddition() {
        return firstNumber + secondNumber;
    }
    // return the subtraction of the fields value of firstNumber and secondNumber
    public double getSubtraction() {
        return firstNumber - secondNumber;
    }
    // return the multiplication of the fields value of firstNumber and secondNumber
    public double getMultiplication() {
        return firstNumber * secondNumber;
    }
    // return the division of the fields value of firstNumber and secondNumber
    // in case the secondNumber is 0, then return 0
    public double getDivision() {
        return (secondNumber == 0) ? 0 : firstNumber / secondNumber;
        /*
            if(secondNumber == 0) {
                return 0;
            } else {
                return firstNumber / secondNumber
            }
        */
    }
}
