package com.epsi.mycal;

import java.nio.charset.Charset;
import java.util.Scanner;

public class Application {

  /**
   * This is the entry point of the program.
   * 
   * @param args Table with arguments
   */
  public static void main(String[] args) {
    System.out.println("Hello World !");

    Scanner myObj = new Scanner(System.in, Charset.defaultCharset());
    Calculator calc = new Calculator();

    System.out.println("Choose your operator : 1-Addition 2-Subtraction 3-Multiplication 4-Division 5-Even number 6-First number");
    int line = myObj.nextInt();
    int firstNumber;
    int secondNumber;
      switch (line) {
      case 1:
        System.out.println("First number :");
        firstNumber = myObj.nextInt();
        System.out.println("Second number :");
        secondNumber = myObj.nextInt();
        System.out.println("Response : " + calc.add(firstNumber, secondNumber));
        break;
      case 2:
        System.out.println("First number :");
        firstNumber = myObj.nextInt();
        System.out.println("Second number :");
        secondNumber = myObj.nextInt();
        System.out.println("Response : " + calc.sub(firstNumber, secondNumber));
        break;
      case 3:
        System.out.println("First number :");
        firstNumber = myObj.nextInt();
        System.out.println("Second number :");
        secondNumber = myObj.nextInt();
        System.out.println("Response : " + calc.mul(firstNumber, secondNumber));
        break;
      case 4:
        System.out.println("First number :");
        firstNumber = myObj.nextInt();
        System.out.println("Second number :");
        secondNumber = myObj.nextInt();
        System.out.println("Response : " + calc.div(firstNumber, secondNumber));
        break;
      case 5:
        System.out.println("Number :");
        firstNumber = myObj.nextInt();
        if (calc.eve(firstNumber)) {
          System.out.println("Response : " + firstNumber + " is even");
        } else {
          System.out.println("Response : " + firstNumber + " is not even");
        }
        break;
      case 6:
        System.out.println("Number :");
        firstNumber = myObj.nextInt();
        if (calc.pri(firstNumber)) {
          System.out.println("Response : " + firstNumber + " is a first number");
        } else {
          System.out.println("Response : " + firstNumber + " is not a first number");
        }
        break;
      default:
        System.out.println("Incorrect value");
      }

  }

}
