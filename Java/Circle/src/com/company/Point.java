package com.company;

public class Point {
    private double X, Y;

    // Default constructor
    public Point() {
        this.X = this.Y = 0;
    }

    // Constructor with a single value and assigns the value to both X and Y
    public Point(double val) {
        this.X = this.Y = val;
    }

    // Constructor with two value
    public Point(double val1, double val2) {
        this.X = val1;
        this.Y = val2;
    }

    // equals method that compares two points
    public boolean equals(Point point) {
        // compare the two Point objects: this and point
        if(this.X == point.X && this.Y == point.Y)
            return true;
        return false;
    }

    // toString method
    public String toString() {
        //return the point as a couple (X, Y).
        return "(" + this.X + ", " + this.Y + ")";
    }

    // returns a Point object which is a shift by a on both x and y-axis
    public Point shift(double a) {
        Point point = new Point(this.X + a, this.Y + a);
        return point;
    }

    //  returns a Point as the sum of two points.
    public Point add(Point point) {
        Point result = new Point();
        result.setX(this.getX() + point.getX());
        result.setY(this.getY() + point.getY());
        return result;
    }

    // returns the distance between this point and p
    // distance between two points is computed as follows  p1(x1, y1) and p2(x2, y2) then distance = sqrt((x1-x2)^2 + (y1-y2)^2)
    public double distance(Point p) {
        double distance = Math.sqrt(this.X - p.X)*(this.X - p.X) + (this.Y - p.Y)*(this.Y - p.Y);
        return distance;
    }

    public double getX() {
        return X;
    }
    public void setX(double x) {
        this.X = x;
    }
    public double getY() {
        return Y;
    }
    public void setY(double y) {
        this.Y = y;
    }
}
