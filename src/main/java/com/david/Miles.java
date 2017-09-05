package com.david;

import static input.InputUtils.stringInput;
import static input.InputUtils.doubleInput;

public class Miles {

    public static void main(String[] args){

      double miles = doubleInput("How many miles did you drive?");
      double gas = doubleInput("How many gallons of gas did you use?");
      double mpg = mpgCalc(miles, gas);

      System.out.println("You got " + mpg + "per gallon for this trip.");
      }


     public static double mpgCalc(double miles, double gas){
      double mpg = miles / gas;
      return mpg;
     }
}
