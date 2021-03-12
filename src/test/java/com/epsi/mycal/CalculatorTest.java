package com.epsi.mycal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testAdd() {
    int valueA = 2;
    int valueB = 3;

    Calculator calc = new Calculator();
    int actual = calc.add(valueA, valueB);

    assertEquals(5, actual);
  }

  @Test
  public void testSub() {
    int valueA = 4;
    int valueB = 2;

    Calculator calc = new Calculator();
    int actual = calc.sub(valueA, valueB);

    assertEquals(2, actual);
  }

  @Test
  public void testMul() {
    int valueA = 4;
    int valueB = 2;

    Calculator calc = new Calculator();
    int actual = calc.mul(valueA, valueB);

    assertEquals(8, actual);
  }

  @Test
  public void testDiv() {
    int valueA = 4;
    int valueB = 2;

    Calculator calc = new Calculator();
    int actual = calc.div(valueA, valueB);

    assertEquals(2, actual);
  }

  @Test
  public void testEve() {
    int even = 4;
    int notEven = 3;

    Calculator calc = new Calculator();

    boolean actual = calc.eve(even);
    assertEquals(true, actual);

    actual = calc.eve(notEven);
    assertEquals(false, actual);

  }

  @Test
  public void testPri() {
    int Prime = 2;
    int notPrime = 1;

    Calculator calc = new Calculator();

    boolean actual = calc.pri(Prime);
    assertEquals(true, actual);

    actual = calc.pri(notPrime);
    assertEquals(false, actual);
  }

}
