package com.company;

public class Point {
    // private members
    private double X, Y;

    // Default Constructor
    public Point() {
        X = Y = 0;
    }
    // Constructor that accept two parameters
    public Point(double x, double y) {
        this.X = x;
        this.Y = y;
    }
    // toString method that return the private members (X, Y).
    public String toString() {
        return "("+ this.X + "," + this.Y +")";
    }
    // equals method that accept a Point, return true if the two Point are the same
    public boolean equals(Point point) {
        if(this.X == point.X && this.Y == point.Y) {
            return true;
        }
        return false;
    }
    // method distance that accept a Point and compute the distance
    public double distance(Point point) {
        int distanceX = (int) (X - point.X);
        int distanceY = (int) (Y - point.Y);
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }
    // getters and setters
    public double getX() {
        return X;
    }
    public void setX(double x) {
        X = x;
    }
    public double getY() {
        return Y;
    }
    public void setY(double y) {
        Y = y;
    }
}
