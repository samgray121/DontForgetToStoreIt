package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    int meaningOfLifeAndEverything = 42;
    double pi = 3.14159;
    String cheese, color;


    Scanner inputReader = new Scanner(System.in);

    System.out.println("Give me pi to at least 5 decimals: ");
    inputReader.nextDouble();

    System.out.println("What is the meaning of life, the universe and everything? ");
    inputReader.nextInt();

    System.out.println("What is your favorite kind of cheese? ");
    inputReader.next();

    System.out.println("Do you like the color red or blue more? ");
    inputReader.next();


   // System.out.println("Ooh, " + color + " " + cheese +" sounds delicious!");

    // System.out.println("The circumference of life is " +( 2 * pi * meaningOfLifeAndEverything));






    }
}
