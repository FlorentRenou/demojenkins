package com.epsi.mycal;

public class Calculator {

  public int add(int valueA, int valueB) {
    return valueA + valueB;
  }

  public int sub(int valueA, int valueB) {
    return valueA - valueB;
  }

  public int mul(int valueA, int valueB) {
    return valueA * valueB;
  }

  public int div(int valueA, int valueB) {
    return valueA / valueB;
  }

  public boolean eve(int valueA) {

    if ((valueA % 2) == 0) {
      return true;
    } else {
      return false;
    }

  }

  public boolean pre(int valueA) {

    boolean isPremier = true;

    if (valueA < 0 || valueA == 1) {
      isPremier = false;
    } else if (valueA != 0) {
      for (int valueB = 2; valueB <= valueA / 2; valueB++) {
        if (valueA != valueB && valueA % valueB == 0) {
          isPremier = false;
          break;
        }
      }
    }
    return isPremier;
  }

}
