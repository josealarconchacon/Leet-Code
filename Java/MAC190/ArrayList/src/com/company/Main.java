package com.company;

public class Main {

    public static void main(String[] args) {
        // create an object of the class ArrayList I just created
        ArrayList L = new ArrayList(200);
        L.add(-3);
        L.add(-5);
        L.add(-7);
        L.add(-9);
        System.out.println("A: " + L.toString());
        L.add(-11);
        System.out.println("A: " + L.toString());
        System.out.println("removing: " + L.removeBack());
        System.out.println("A: " + L.toString());
        System.out.println("removing: " + L.removeFront());
        System.out.println("A: " + L.toString());
        L.addFront(-13);
        System.out.println("A: " + L.toString());
        L.addFront(-15);
        System.out.println("A: " + L.toString());
        try {
            System.out.println("removing: " + L.remove(5));
            System.out.println("A: " + L.toString());
        }catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }

        try {
            L.add(10, -29);
            System.out.println("A: " + L.toString());
        }catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
