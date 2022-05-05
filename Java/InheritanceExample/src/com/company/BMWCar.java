package com.company;

public class BMWCar extends Vehicle {
    private String Model;
    private char FuelType;


    public BMWCar() {
        super();
        this.FuelType = '?';
        this.Model = "unkown";
    }

    public BMWCar(char fuelType, String model) {
        super(0, 0, 4, "BMW", " 0");
        this.FuelType = fuelType;
        this.Model = model;
    }

    @Override
    public String toString() {
        return  super.toString() + ", FuelType: " + this.FuelType + " ,Model: " + this.Model;
    }

    public char getFuelType() {
        return FuelType;
    }

    public void setFuelType(char fuelType) {
        FuelType = fuelType;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
