package com.david;

import static input.InputUtils.stringInput;

public class Main {

    public static void main(String[] args) {

        String name = stringInput("Please enter your name");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    }


    public static String makeGreeting(String n) {

        String greeting = "Hello " + n + "!";
        return greeting;
    }


    /*public static void squares(String[] args){

        System.out.println("Here are the squares of the numbers 1 to 10");

        for (int x = 1; x <= 10; x++){
            double xsquared = square(x);
            System.out.println("The square of " + x + " is " + xsquared);
        }
    }

    public static double square(double n){

        double sq = n * n;
        return sq;
    }*/

}
