package com.company;


// Use inherits because avery Dog is an animal
// The class Dog inherits all private members of Animal Class
public class Dog extends Animal {
    private String Bred;

    public Dog() {
        // construct the parent object first
//        super();
        this.setSpecies("Canine");
        this.Bred = "unknown";
    }

    public Dog(String C, int A, String B) {
        // construct the parent object Animal
        super("Canine", C, A);
        // or this.setColor(C); and this.setAge(A);
        this.Bred = B;
    }

    public String toString() {
        return  super.toString() + ", Bred " + this.Bred;
    }

    public boolean equal(Dog D) {
        if(super.equal(D) && this.Bred.equals(D.Bred)) {
            return true;
        }
        return false;
    }

    @Override
    public void speak() {
        System.out.println("Woof Woof");
    }

    public String getBred() {
        return Bred;
    }
    public void setBred(String bred) {
        Bred = bred;
    }
}
