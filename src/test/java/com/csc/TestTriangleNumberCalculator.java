package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

public class TestTriangleNumberCalculator {

  TriangleNumberCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new TriangleNumberCalculator();
  }
  
  @Test
  void testValue() {
    assertEquals(1, calculator.value(1));
    assertEquals(3, calculator.value(2));
    assertEquals(10, calculator.value(4));
  }
  
  @Test
  void testAdd() {
    assertEquals(2, calculator.add(1, 1));
    assertEquals(9, calculator.add(2, 3));
    assertEquals(13, calculator.add(4, 2));
  }
  
  @Test
  void testSubtract() {
    assertEquals(0, calculator.subtract(1, 1));
    assertEquals(-3, calculator.subtract(2, 3));
    assertEquals(7, calculator.subtract(4, 2));
  }
  
  @Test
  void testMultiply() {
    assertEquals(60, calculator.multiply(3, 4));
    assertEquals(1, calculator.multiply(1, 1));
    assertEquals(9, calculator.multiply(2, 2));
  }
  
  @Test
  void testDivide() {
    assertEquals(6.0, calculator.divide(3, 1), 0.001);
    assertEquals(10.0 / 6.0, calculator.divide(4, 3), 0.001);
    assertEquals(6.0 / 10.0, calculator.divide(3, 4), 0.001);
  }
  
  @Test
  void testSequence() {
    List<Integer> list = calculator.sequence(4);
    assertEquals(1, list.get(0));
    assertEquals(3, list.get(1));
    assertEquals(6, list.get(2));
    assertEquals(10, list.get(3));
  }
  
  

  // Your tests go here
}
