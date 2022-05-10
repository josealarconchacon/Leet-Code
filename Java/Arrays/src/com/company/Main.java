package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayExample();
    }
    public static void ArrayExample() {
        // create array of integers
        int[] arr = new int[10];
        System.out.println("Length of the array is: " + arr.length);
        // assign element to the beginning of the array
        arr[0] = -1;

        Scanner scn = new Scanner(System.in);
        for(int i = 0; i < 10;  i++) {
            System.out.println("Arr["+i+"]: ") ;
            arr[i] = scn.nextInt();
        }
        System.out.println("-------- Showing array -------------");
        for(int i = 0; i < 10; i++) {
            System.out.println("Arr[ " + i + "]: " + arr[i]) ;
        }

        // clone return an array similar to the original array
        int[] arr1 = arr.clone();
        System.out.println("Arr1[0] " + arr1[0]);
        System.out.println("------- Showing Arr1 ----------");
        // fill arr1 with random numbers
        for(int i = 0; i < 10; i++) {
            // generate number from 0 to 1000
            double sign = Math.random();
            if(sign < 0.5) {
                arr1[i] = (int) (Math.random() * 1000);
            } else {
                arr1[i] = (-1) * (int) (Math.random() * 1000);
            }
        }
        for(int i = 0; i < 10; i++)  {
            System.out.println("Arr1["+i+"]: " + arr1[i]);
        }

        // Count how many negative number arr1 has
        int negativeCount = 0;
        for (int i = 0; i < 10; i++) {
            if(arr1[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Total of Negative Numbers in this Array is: " + negativeCount);
    }
}
