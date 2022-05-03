package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a Point P1 using default construtor
        Point P1 = new Point();
        System.out.println("P1: " + P1);
        //set it to (2, 4)
        P1.setX(2);
        P1.setY(4);
        //show it
        System.out.println("P1: " + P1);
        //create a Point P2 with the constructor that accepts one value
        Point P2 = new Point(5);
        //display it
        System.out.println("P2: " + P2.toString());
        //create a point P3 with the constructorr that accepts two valies (4, 5)
        Point P3 = new Point(4, 5);
        //display it
        System.out.println("P3: " + P3);
        //add P1 and P3 into P4
        Point P4 = P1.add(P3);
        //display P4
        System.out.println("P4: " + P4);

        //shift P1 into P1 by 3
        P1 = P1.shift(3);
        //display P1
        System.out.println("P1: " + P1);
        //compute the distance between P1 and P3
        double d = P1.distance(P3);
        System.out.println("The distance between P1 and P3 is: " + d);

        Circle C = new Circle();
        System.out.println("C: " + C.toString());

        Circle C1 = new Circle(P1, 3.4);
        System.out.println("C1: " + C1.toString());

        Circle C2 = new Circle (2.3, 4.3, 5);
        System.out.println("C2: " + C2.toString());

        Circle C3 = C2.zoom(2);
        System.out.println("C2: " + C2.toString());
        System.out.println("C3: " + C3.toString());

        Circle C4 = C2.displace(P1);
        System.out.println("C2: " + C2.toString());
        System.out.println("C4: " + C4.toString());


    }
}
