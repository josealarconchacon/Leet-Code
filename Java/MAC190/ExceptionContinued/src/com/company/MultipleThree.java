package com.company;

public class MultipleThree {
    // member variable
    private int Number;

    public MultipleThree() {
        this.Number = 0;
    }

    // Constructor that accepts an integer. If the integer is not a multiple of three throw your exception to your choice.
    public MultipleThree(int number) throws Exception {
        // use the setter in here
        this.setNumber(number);
    }

    public String toString() {
        return  "Number: " + Number;
    }

    public boolean equal(MultipleThree m) {
        if(this.Number == m.Number) {
            return true;
        }
        return false;
    }

    public MultipleThree add(MultipleThree m) throws Exception {
        // create an object
        MultipleThree num = new MultipleThree(this.Number + m.Number);
        return num;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) throws Exception {
        // check if Number is multiple of 3
        if(number % 3 == 0) {
            this.Number = number;
        } else {
            throw  new Exception(number + " is not a multiple of three");
        }
        Number = number;
    }
}
