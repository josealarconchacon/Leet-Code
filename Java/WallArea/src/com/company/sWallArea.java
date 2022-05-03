package com.company;

public class sWallArea {
    private double width, height;

    public sWallArea() {
        this.width = 0;
        this.height = 0;
    }

    public sWallArea(double w, double h) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.width = height < 0 ? 0 : height;
    }
}
