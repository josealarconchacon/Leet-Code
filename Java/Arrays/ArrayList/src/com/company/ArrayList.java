package com.company;
/*Design and code a class ArrayList that has the following:
 * 1- a reference to an array of integers.
 * 2- an integer size that keeps track of the number of elements added to the array.
 * 3- default constructor that creates an array of 100 integers and sets size to 0;
 * 4- a constructor that accepts the intial capacity of the array and creates an array of that capacity and sets size to 0.
 * 5- getter for size and the array. No setters.
 * 6- to string that a returns the content of the array in the form [1, 3, 5, 6, 8]
 * 7- A method add(int e) that adds element e to the back of the array (last).
 * 8- A tester.
 *
 */
public class ArrayList {
    private int[] array;
    int size;

    public ArrayList() {
        this.array = new int[100];
        this.size = 0;
    }

    public ArrayList(int initialCapacity) {
        this.array = new int[initialCapacity];
        this.size = 0;
    }

    public String toString() {
        for(int i = 0; i < array.length; i++) {
            System.out.println("[ " + i + "] " + array[i]);
        }
        return "Numbers " + this.array;
    }

    public void add(int e) {
        this.array[size] = e;
        size++;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
