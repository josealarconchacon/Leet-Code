package com.company;

public class Main {

    public static void main(String[] args) {
	// Create a default MultipleThree object
        MultipleThree m = new MultipleThree();

        try {
            m.setNumber(8);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("M: " + m);

        try {
            m.setNumber(9);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("M: " + m);
        System.out.println("-------------------------------------------------------");

        MultipleThree m1 = null;
//        System.out.println("m1.Number " + m1.getNumber());
        try {
             m1 = new MultipleThree(7);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("M: " + m1);
        System.out.println("-------------------------------------------------------");

        try {
            MultipleThree m2 = m.add(m1);
            System.out.println("m2 " + m2);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
