package com.company;

public class MultipleThree {
    private int Number;

    // Default constructor to set it to 0
    public MultipleThree() {
        this.Number = 0;
    }
    // Constructor that accepts an integer. If the integer is not a multiple of three throw your exception to your choice.
    public MultipleThree(int number) throws Exception {
        if(number % 3 != 0) {
            throw new Exception(number + " is not multiple by (3)");
        }
        this.Number = number;
    }

    // toString to display the integer
    public String toString() {
        return "[ "+ this.Number + " ]";
    }

    // equals method
    public boolean equal(MultipleThree number) {
        if(this.Number == number.Number) {
            return true;
        }
        return false;
    }

    // MultipleThree add( MultipleThree m) that return an object sum of this and m.
    public MultipleThree add(MultipleThree m) throws Exception {
        try {
            MultipleThree mBy3 = new MultipleThree(this.Number + m.Number);
            return mBy3;
        } catch (Exception e) {
            System.out.println("Invalid: " + e.getMessage());
        }
        return m;
    }

    public int getNumber() {
        return Number;
    }
    // setter that accepts an integer, if the integer is not a multiple of three, throw an exception.
    public void setNumber(int number) {
        Number = number;
    }
}
