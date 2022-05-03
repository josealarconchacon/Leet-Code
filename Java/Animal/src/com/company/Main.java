package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a Default Animal
        Animal A = new Animal();
        System.out.println(A.toString());

        Animal A1 = new Dog();
        System.out.println("" + A1.toString());
        A1.speak();

        Animal A2 = new Cat();
        System.out.println("" + A2.toString());
        A2.speak();
    }
}
