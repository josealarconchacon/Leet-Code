package com.company;

public class Point {
    private double X, Y;

    //setters
    public void setX(double a ){
        this.X = a;
    }
    public void setY(double y) {
        this.Y = y;
    }
    //getters
    public double getX() {
        return this.X;
    }
    public double getY() {
        return this.Y;
    }

    //default constructor is the constructor that has no parameters
    public Point() {
        this.X = this.Y = 0;
    }
    //constructor that accepts one value
    public Point(double v) {
        this.X = this.Y = v;
    }
    public Point(double vx, double vy) {
        this.X = vx;
        this.Y = vy;
    }

    public boolean equals(Point p) {
        //we have two Point objects: this and p
        if(this.X == p.X && this.Y == p.Y)
            return true;
        return false;
    }
    public String toString() {
        //return the point as a couple (X, Y).
        String st = "(" + this.X + ", " + this.Y + ")";
        return st;

    }
    public Point shift(double a) {
        //create a Point object to return
        Point p = new Point(this.X + a, this.Y + a);
        return p;
    }
    public Point add(Point p) {
        //how points are we dealing with here? 3 objects
        //cerate a new Point
        Point res = new Point();
        res.X = this.X + p.X;//you can do ti like this or as in the next line using getters and setters
        res.setY(this.getY() + p.getY());
        return res;

    }
    public double distance(Point p) {
        double D = Math.sqrt((this.X - p.X)*(this.X - p.X) + (this.Y - p.Y)*(this.Y - p.Y));
        return D;
    }
}
