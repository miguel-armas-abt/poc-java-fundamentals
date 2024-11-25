package com.demo.poc.datastructures.sets;

import java.util.HashSet;
import java.util.Set;

public class IntroSet {

  public static void main(String[] args) {
    Set<String> dniSet = new HashSet<>();
    dniSet.add("7654321");
    dniSet.add("7654321");
    dniSet.add("7654322");

    for (String dni: dniSet) {
      System.out.println(dni);
    }
  }
}
