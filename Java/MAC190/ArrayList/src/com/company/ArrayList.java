package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList {
    private int[] A;
    private int size;

    //default constructor
    public ArrayList() {
        //create an array of 100 integers
        A = new int[100];
        //set size to 0
        size = 0;
    }
    public ArrayList(int capacity) {
        //create an array of capacity integers
        A = new int[capacity];
        //set size to 0
        size = 0;
    }
    public void add(int e) {
        A[size] = e;
        size++;
    }

    public int removeBack() {
        if(size == 0) {
            System.out.println("Array empty");
            return 0;
        }
        size--;
        return A[size];
    }
    //method remove front that removes the first (at index 0)
    //and pulls down all other elements and returns the removed one.

    public int removeFront() {
        if(size == 0) {
            System.out.println("Array empty");
            return 0;
        }
        //save the first if it exists
        int save = A[0];
        //bring all elements down by one
        for(int i = 0; i < size-1; i++) {
            A[i] = A[i+1];
        }
        size--;
        return save;
    }
    //method addFont that adds a new element to the front of the list
    public void addFront(int e) {
        //push up all elements by one
        for(int i = size; i > 0; i--) {
            //copy the one below up
            A[i] = A[i-1];
        }

        //add e at index 0
        A[0] = e;
        size++;
    }

    //removing a specific index
    public int remove(int index) {
        if(size == 0) {
            System.out.println("Array is empty");
            return 0;
        }
        // save the first if it exist
        int save = A[index];
        // bring all element dow by one
        for(int i = 0; i < size - 1; i++) {
            A[i] = A[i+1];
        }
        size--;
        return save;
    }

    private void resize() {
        //create a new array with length old length + 5
        int[] newArr = new int[A.length + 5];

        //copy all data of old array into new array
        for(int i = 0; i < A.length; i++) {
            newArr[i] = A[i];
        }
        //assign new array to old array.
        A = newArr;
    }

    //adding to a specific index
    public void add(int index, int e) {
        for(int i = size; i > index; i--) {
            A[i] = A[i-1];
        }
        A[index] = e;
        size++;
    }

    public String toString() {
        if(size == 0)
            return "[]";
        String st = "[";
        //loop to go through your array and add each element to the string
        for(int i = 0; i <size-1; i++) {
            st = st + A[i] + ", ";
        }
        st += A[size-1] + "]";
        return st;
    }
}
