package com.company;

public class Vehicle {
    private int VinNumber, NumberOfDoors, NumberOfWheels;
    private String Maker, HorsePower;

    public Vehicle() {
        this(0, 0, 0, "unknown", " 0");
    }

    public Vehicle(int vinNumber, int numberOfWheels, int numberOfDoors, String maker, String horsePower) {
        this.VinNumber = vinNumber;
        this.NumberOfDoors = numberOfDoors;
        this.NumberOfWheels = numberOfWheels;
        this.Maker = maker;
        this.HorsePower = horsePower;
    }

    public String toString() {
        return "VinNumber: " + VinNumber + " ,NumberOfDoors: " + NumberOfDoors +
                " ,NumberOfWheels: " + NumberOfWheels + " ,Maker: " + Maker + " ,HorsePower: " + HorsePower;
    }

    public boolean equal(Vehicle V) {
        if(this.VinNumber == V.VinNumber && this.NumberOfDoors == V.NumberOfDoors && this.NumberOfWheels == V.NumberOfWheels &&
        this.Maker.equals(V.Maker) && this.HorsePower.equals(V.HorsePower)) {
            return true;
        }
        return false;
    }

    public Integer getVinNumber() {
        return VinNumber;
    }

    public void setVinNumber(Integer vinNumber) {
        VinNumber = vinNumber;
    }

    public Integer getNumberOfDoors() {
        return NumberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        NumberOfDoors = numberOfDoors;
    }

    public Integer getNumberOfWheels() {
        return NumberOfWheels;
    }

    public void setNumberOfWheels(Integer numberOfWheels) {
        NumberOfWheels = numberOfWheels;
    }

    public String getMaker() {
        return Maker;
    }

    public void setMaker(String maker) {
        Maker = maker;
    }

    public String getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(String horsePower) {
        HorsePower = horsePower;
    }
}
