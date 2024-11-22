package com.demo.poc.datastructures.arrays;

/**
 * Los arreglos (arrays) son estructuras de datos que permiten almacenar múltiples elementos.
 *
 * Características:
 * - Una vez que el arreglo ha sido definido no puede cambiar su tamaño.
 * - Puede almacenar tanto datos primitivos como objetos.
 */
public class IntroArrays {

  public static void main(String[] args) {
    String[] currencyArray = new String[10];
    currencyArray[0] = "PEN";  // Sol peruano
    currencyArray[1] = "USD";  // Dólar estadounidense
    currencyArray[2] = "EUR";  // Euro
    currencyArray[3] = "JPY";  // Yen japonés
    currencyArray[4] = "GBP";  // Libra esterlina
    currencyArray[5] = "AUD";  // Dólar australiano
    currencyArray[6] = "CAD";  // Dólar canadiense
    currencyArray[7] = "CHF";  // Franco suizo
    currencyArray[8] = "CNY";  // Yuan chino
    currencyArray[9] = "BRL";  // Real brasileño

    System.out.println("\n########## Segundo elemento (índice 1) #############");
    String secondElement = currencyArray[1];
    System.out.println(secondElement);

    System.out.println("\n########## Recorrido de todos sus elementos #############");
    for(String name: currencyArray) {
      System.out.println(name.toUpperCase());
    }
  }
}