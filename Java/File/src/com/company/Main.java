package com.company;
import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // - /Users/josealarconchacon/Downloads/jose.txt;

        //Ask the user for the path and file name
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = sc.nextLine();
        //create a file
        File outFile = new File(fileName);
        if(outFile.exists()) {
            System.out.println("File already exist will be overritten");
        }
        if(outFile == null) {
            System.out.println("Couldn't create file");
            System.exit(1);
        }
        try {
            FileWriter fw = new FileWriter(outFile);
            BufferedWriter bw = new BufferedWriter(fw);

            //enter a loop  and keep reading lines until the line is one dot.
            System.out.println("Enter your text, end it with a . on an empty line:");
            //each time you read a like write it to the file
            String line = sc.nextLine();
            while(line.trim().equals(".") == false) {
                //write it to the file
                bw.write(line);
                bw.write("\n");
                //read the next line
                line = sc.nextLine();
            }
            bw.close();
        }catch(IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}