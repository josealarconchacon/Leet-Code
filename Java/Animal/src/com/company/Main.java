package com.company;

public class Main {

    public static void main(String[] args) {
        Animal A1 = new Dog();
        System.out.println("" + A1);
        A1.speak();

        Animal A2 = new Cat();
        System.out.println("" + A2);
        A2.speak();
    }
}
