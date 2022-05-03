package com.company;
// mammal
public class Cat extends Animal {
    private boolean dangerous;

    public Cat() {
//        super();
        this.setSpecies("Mammal");
        this.dangerous = false;
    }

    public Cat(String C, int A, boolean D) {
        // construct the parent object Animal
        super("Mammal", C, A);
        this.dangerous = D;
    }

    public String toString() {
        return  super.toString() + ", is dangerous: " + this.dangerous;
    }

    public boolean equal(Cat C) {
        if(super.equal(C) && !this.dangerous) {
            return true;
        }
        return false;
    }
    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    public boolean isDangerous() {
        return dangerous;
    }

    public void setDangerous(boolean dangerous) {
        this.dangerous = dangerous;
    }
}
