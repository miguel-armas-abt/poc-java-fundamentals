package com.demo.poc.regex;

/**
 * Una expresión regular (REGEX) es una secuencia de caracteres que forma una patrón de búsqueda.
 * Con ayuda de las REGEX podemos verificar si una cadena de texto cumple con un patrón específico.
 */
public class IntroRegex {
  public static void main(String[] args) {

    String phoneToTest = "938817321";

    boolean isPhone = phoneToTest.matches("^9\\d{8}$");
    System.out.println(isPhone);

  }
}
