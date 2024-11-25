package com.demo.poc.exceptions.unchecked;

public class Application {

  public static void main(String[] args) {

    //ArithmeticException
    int divisor = 10;
    int dividend = 0;
    int result = divisor/dividend;
    System.out.println(result);

    //NullPointerException
    String name = null;
    System.out.println("My name is ".concat(name));
  }
}