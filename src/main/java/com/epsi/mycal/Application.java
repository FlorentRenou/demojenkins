package com.epsi.mycal;

import java.util.Scanner;

public class Application {

  /**
   * This is the entry point of the program.
   * 
   * @param args Table with arguments
   */
  public static void main(String[] args) {
    System.out.println("Hello World !");

    Scanner myObj = new Scanner(System.in);
    Calculator calc = new Calculator();

    System.out.println(
        "Choose your operator : 1-Addition 2-Subtraction 3-Multiplication 4-Division 5-Even number 6-First number");
    int line = myObj.nextInt();

    if (line == 1) {

      System.out.println("First number :");
      int ValueA = myObj.nextInt();
      System.out.println("Second number :");
      int ValueB = myObj.nextInt();
      System.out.println("Response : " + calc.add(ValueA, ValueB));

    } else if (line == 2) {

      System.out.println("First number :");
      int ValueA = myObj.nextInt();
      System.out.println("Second number :");
      int ValueB = myObj.nextInt();
      System.out.println("Response : " + calc.sub(ValueA, ValueB));

    } else if (line == 3) {

      System.out.println("First number :");
      int ValueA = myObj.nextInt();
      System.out.println("Second number :");
      int ValueB = myObj.nextInt();
      System.out.println("Response : " + calc.mul(ValueA, ValueB));

    } else if (line == 4) {

      System.out.println("First number :");
      int ValueA = myObj.nextInt();
      System.out.println("Second number :");
      int ValueB = myObj.nextInt();
      System.out.println("Response : " + calc.div(ValueA, ValueB));

    } else if (line == 5) {

      System.out.println("Number :");
      int ValueA = myObj.nextInt();
      if (calc.eve(ValueA)) {
        System.out.println("Response : " + ValueA + " is even");
      } else {
        System.out.println("Response : " + ValueA + " is not even");
      }

    } else if (line == 6) {

      System.out.println("Number :");
      int ValueA = myObj.nextInt();
      if (calc.pri(ValueA)) {
        System.out.println("Response : " + ValueA + " is a first number");
      } else {
        System.out.println("Response : " + ValueA + " is not a first number");
      }

    } else {
      System.out.println("Incorrect value");
    }

  }

}
