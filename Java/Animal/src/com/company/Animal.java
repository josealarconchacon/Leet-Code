package com.company;

public class Animal {
    private String Species, Color;
    private int Age;

    public Animal() {
        this("unknown", "unknown", 0);
    }

    public Animal(String S, String C, int A) {
        this.Species = S;
        this.Color = C;
        this.Age = A;
    }

    public void speak() {
        System.out.println("I don't know how to speak yet");
    }

    public String toString() {
        return "Species: " + Species + ", " + "Color: " + ", " + "Age: " + Age;
    }

    public boolean equal(Animal A) {
        if(this.Species.equals(A.Species) && this.Color.equals(A.Color) && this.Age == A.Age) {
            return true;
        }
        return false;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
