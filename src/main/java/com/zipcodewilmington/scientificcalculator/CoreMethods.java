package com.zipcodewilmington.scientificcalculator;

public class CoreMethods {

    //addition
    public double calcAdd(double a, double b) {return a + b;}

    //subtraction
    public double calcSubt(double a, double b) {return a-b;}

    //multiplication
    public double calcMult(double a, double b) {return a * b;}

    //division
    public double calcDiv(double a, double b) {return a / b;}

    //square
    public double calcSquare(double a) {return a * a;}

    //square root
    public double calcRoot(double a) {return Math.sqrt(a);}

    //exponent
    public double calcExponent(double a, double b) {return Math.pow(a, b);}

    //inverse fraction (x/1 --> 1/x)
    public double calcInverseFraction(double a) {return 1 / a;}

    //inverse sign (-/+ --> +/-)
    public double calcInverseSign(double a) {return a * -1;}


}
