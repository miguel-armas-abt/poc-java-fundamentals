package com.demo.poc.statics;

public class Application {

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      Accumulator accumulator = new Accumulator("ac" + i);
      System.out.println(accumulator);
    }

    int counter = Accumulator.count;
    System.out.println(counter);
  }
}
