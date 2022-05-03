package com.company;

public class Circle extends Point {

    private double radius;

    public Circle() {
        radius = 0;
    }
    public Circle(Point c, double r) {
        this.setX(c.getX());
        this.setX(c.getY());
        radius = r;
    }
    public Circle (double x, double y, double r) {
        this.setX(x);
        this.setX(y);
        radius = r;
    }

    public Point getCenter() {
        return this; //because this is a point as well.
    }
    public void setCenter(Point c) {
        this.setX(c.getX());
        this.setX(c.getY());
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        this.radius = r;
    }

    public String toString() {
        return "[" + super.toString() + ", " + radius +"]";
        //super refers to the parent class, in this case Point
    }

    public Circle zoom(double a) {
        //create a cricle with same center as this and radius a*this.radius
        Circle temp = new Circle(this.getX(), this.getY(), a*this.radius);
        return temp;
    }
    public Circle displace(Point p) {
        Circle temp =  new Circle(p, this.radius);
        return temp;
    }
}
