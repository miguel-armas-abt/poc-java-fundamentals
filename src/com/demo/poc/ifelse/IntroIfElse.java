package com.demo.poc.ifelse;

import java.util.Scanner;

/**
 * La estructura condicional if-else permite tomar decisiones en base a una condición.
 */
public class IntroIfElse {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la edad del solicitante: ");
    int age = scanner.nextInt();

    if (age >= 18) {
      System.out.println("El solicitante es mayor de edad");
    } else {
      throw new IllegalArgumentException("El solicitante no cumple con la mayoría de edad");
    }
  }

}