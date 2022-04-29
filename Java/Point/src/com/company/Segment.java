package com.company;

public class Segment {

    // private member
    private Point pointA;
    private Point pointB;

    // Default Constructor that set both point to 0
    public  Segment() {
        // implement
        pointA = new Point();
        pointB = new Point();
    }

    // Constructor that accept two point
    public Segment(Point pa, Point pb) {
        this.pointA = pa;
        this.pointB = pb;
    }

    // toString method return
    public String toString() {
        return "{"+ (this.pointA) + "," + (this.pointB) +"}";
    }

    // method equal that accept a Segment and return true if the two Segment are equal
    public boolean equals(Segment s) {
        if(this.pointA == s.pointA && this.pointB == s.pointB) {
            return true;
        }
        return false;
    }

    // return the distance between the two point
    public double measurement() {
        double distance = (int)Math.sqrt(pointA.distance(pointA) + (pointB.distance(pointB)));
        return distance;
    }

    public Segment Move(double a) {
        Point p1 = new Point(this.pointA.getX() + a, this.pointB.getY() + a);
        Point p2 = new Point(this.pointB.getX() + a, this.pointB.getY() + a);
        Segment s1 = new Segment(p1,p2);
        return s1;
    }

    // return a Segment object where the coordinates are the sum of this and S
    public Segment add(Segment S) {
        Point newPA = new Point(this.pointA.getX() + S.pointA.getX(), this.pointA.getY() + S.pointA.getY());
        Point newPB = new Point(this.pointB.getX() + S.pointB.getX(), this.pointB.getY() + S.pointB.getY());
        Segment s = new Segment(newPA, newPB);
        return s;
    }

    public Point getPointA(Point pointA) {
        return this.pointA;
    }
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }
    public Point getPointB() {
        return pointB;
    }
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }
}


























