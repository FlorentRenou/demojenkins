package com.epsi.mycal;

/**
 * Operation class.
 * 
 * @author Florent
 *
 */
public class Calculator {

  /**
   * Addition method.
   * 
   * @param valueA First number
   * @param valueB Second number
   * @return The addition of the two numbers
   */
  public int add(int valueA, int valueB) {
    return valueA + valueB;
  }

  /**
   * Subtraction method.
   * 
   * @param valueA First number
   * @param valueB Second number
   * @return The subtraction of the two numbers
   */
  public int sub(int valueA, int valueB) {
    return valueA - valueB;
  }

  /**
   * Multiplication method.
   * 
   * @param valueA First number
   * @param valueB Second number
   * @return The subtraction of the two numbers
   */
  public int mul(int valueA, int valueB) {
    return valueA * valueB;
  }

  /**
   * Division method.
   * 
   * @param valueA First number
   * @param valueB Second number
   * @return The division of the two numbers
   */
  public int div(int valueA, int valueB) {
    return valueA / valueB;
  }

  /**
   * Even number method.
   * 
   * @param valueA First number
   * @return If the number is even or not
   */
  public boolean eve(int valueA) {

    if ((valueA % 2) == 0) {
      return true;
    } else {
      return false;
    }

  }

  /**
   * Prime number method.
   * 
   * @param valueA First number
   * @return If the number is prime or not
   */
  public boolean pri(int valueA) {

    boolean isPrime = true;

    if (valueA < 0 || valueA == 1) {
      isPrime = false;
    } else if (valueA != 0) {
      for (int valueB = 2; valueB <= valueA / 2; valueB++) {
        if (valueA != valueB && valueA % valueB == 0) {
          isPrime = false;
          break;
        }
      }
    }
    return isPrime;
  }

}
