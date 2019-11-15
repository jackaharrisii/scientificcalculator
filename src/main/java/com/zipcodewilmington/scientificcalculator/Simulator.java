package com.zipcodewilmington.scientificcalculator;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;


import java.util.ArrayList;
import java.util.Scanner;
import io.Console;

public class Simulator {
    private double num1, num2;
    private double answer;
    private int input;
    private CoreMethods coreMethods = new CoreMethods();

    public void displayMenu(){
        String header = String.format("My Math App Has Jets");
        ArrayList<String> choices = new ArrayList<>();
        choices.add("Add");
        choices.add("Subtract");
        choices.add("Multiply");
        choices.add("Divide");
        choices.add("Square");
        choices.add("Square Root");
        choices.add("Exponent");
        choices.add("Inverse Fraction");
        choices.add("Inverse Sign");

        handleChoice(Console.getInput(header, choices.toArray(new String[choices.size()])));
    }

    public void handleChoice(int input) {
        if (input == 1) {
            num1 = Double.parseDouble(Console.getInput("First number?"));
            num2 = Double.parseDouble(Console.getInput("Second number?"));
            Console.print(String.format("%f plus %f is: %f\n****************************\n", num1, num2, coreMethods.calcAdd(num1, num2)));
            displayMenu();
        }
        else if (input == 2){
            num1 = Double.parseDouble(Console.getInput("First number?"));
            num2 = Double.parseDouble(Console.getInput("Second number?"));
            Console.print(String.format("%f minus %f is: %f\n****************************\n", num1, num2, coreMethods.calcSubt(num1, num2)));
            displayMenu();
        }
        else if (input == 3){
            num1 = Double.parseDouble(Console.getInput("First number?"));
            num2 = Double.parseDouble(Console.getInput("Second number?"));
            Console.print(String.format("%f times %f is: %f\n****************************\n", num1, num2, coreMethods.calcMult(num1, num2)));
            displayMenu();
        }
        else if (input == 4){
            num1 = Double.parseDouble(Console.getInput("First number?"));
            num2 = Double.parseDouble(Console.getInput("Second number?"));
            Console.print(String.format("%f divided by %f is: %f\n****************************\n", num1, num2, coreMethods.calcDiv(num1, num2)));
            displayMenu();
        }
        else if (input == 5){
            num1 = Double.parseDouble(Console.getInput("First number?"));
            Console.print(String.format("%f squared is: %f\n****************************\n", num1, coreMethods.calcSquare(num1)));
            displayMenu();}
        else if (input == 6){
            num1 = Double.parseDouble(Console.getInput("First number?"));
            Console.print(String.format("The square root of %f is: %f\n****************************\n", num1, coreMethods.calcRoot(num1)));
            displayMenu();}
        else if (input == 7){
            num1 = Double.parseDouble(Console.getInput("First number?"));
            num2 = Double.parseDouble(Console.getInput("Second number?"));
            Console.print(String.format("%f to the power of %f is: %f\n****************************\n", num1, num2, coreMethods.calcExponent(num1, num2)));
            displayMenu();
        }
        else if (input == 8){
            num1 = Double.parseDouble(Console.getInput("First number?"));
            Console.print(String.format("The inverse fraction of %f is: %f\n****************************\n", num1, coreMethods.calcInverseFraction(num1)));
            displayMenu();}
        else if (input == 9){
            num1 = Double.parseDouble(Console.getInput("First number?"));
            Console.print(String.format("The inverse of %f is: %f\n****************************\n", num1, coreMethods.calcInverseSign(num1)));
            displayMenu();}
        else {
            Console.print("Please make a valid selection\n");
            displayMenu();
        }
    }

//    public static void runSimulator() {
//        Scanner input = new Scanner(System.in);
//        Console.println(
//                "What would you like to do? \n" +
//                "1 - Add \n" +
//                "2 - Subtract \n" +
//                "3 - Multiply \n" +
//                "4 - Divide \n" +
//                "5 - Square \n" +
//                "6 - Square Root\n" +
//                "7 - Exponent\n" +
//                "8 - Inverse Fraction\n" +
//                "9 - Inverse Sign\n"
//        );
//        int chooseOperation = input.nextInt();
//
//    }
//
//    public static void chooseOperation (int input){
////        if
//    }

}
