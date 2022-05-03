package com.company;

import java.awt.*;

public class sPoint {
    private int x, y;

    public sPoint() {
        this.x = 0;
        this.y = 0;
    }

    public sPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // return the distance between this Point and Point (0.0)
    public double distance() {
        return Math.sqrt ((getX() - 0.0) * (getX() - 0.0) + (getY() - 0.0) * (getY() - 0.0));
    }

    // return the distance between this Point and Point (x,y) ad double
    public double distance(int x, int y) {
        return  Math.sqrt((getX() - x)* (getX() - x) + (getX() - y) * (getY() - y));
    }

    // // return the distance between this Point and another Point
    public double distance(Point p) {
        return Math.sqrt(((this.x - p.x) * (this.x - p.x) + (this.y - p.y) + (this.y - p.y)));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
