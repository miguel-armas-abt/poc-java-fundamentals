package com.demo.poc.statics;

public class Accumulator {
  public static int count = 0; // Variable estática

  private String name;

  public Accumulator(String name) {
    count++;
    this.name = name;
  }

  @Override
  public String toString() {
    return "{" + name + "}";
  }
}
