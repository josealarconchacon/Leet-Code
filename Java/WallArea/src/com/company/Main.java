package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	    sPoint p1 = new sPoint(6,5);
        sPoint p2 = new sPoint(3,1);

        System.out.println("Distance (0,0) = " + p1.distance());
//        System.out.println("Distance (p2) = " + p1.distance(p2));
        System.out.println("Distance(2,2) = " + p1.distance(2,2));

    }
}
