package com.demo.poc.methods;

import java.util.Scanner;

/**
 * Los métodos son bloques de código que realizan una tarea específica y pueden ser llamados desde otras parte del programa.
 *
 * Elementos:
 * - Nombre de método: Nombre que representa la acción que hace el método.
 * - Parámetros de entrada: Valores pasados al método.
 * - Tipo de retorno: Tipo de dato que devuelve el método al coomletar su tarea.
 *
 * Tipos:
 * - Función: Método que retorna un tipo de dato.
 * - Procedimiento: Método que ejecuta una acción, pero no tiene tipo de retorno (void).
 */
public class IntroMethods {

  public static void main(String[] args) {
    System.out.println("################ Suma ################");
    int sumResult = sum(2, 3);
    System.out.println(sumResult);

    System.out.println("################ Exponente ################");
    double exponentResult = exponent(2, 3);
    System.out.println(exponentResult);

    System.out.println("################ Mayor de edad ################");
    printMessageIfIsLegalAge();
  }

  static double exponent(int base, int exponent) {
    return Math.pow(base, exponent);
  }

  static int sum(int firstNumber, int secondNumber) {
    return firstNumber + secondNumber;
  }

  static boolean isLegalAge() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la edad: ");
    int age = scanner.nextInt();

    return (age >= 18);
  }

  static void printMessageIfIsLegalAge() {
    boolean isLegalAge = isLegalAge();
    if(isLegalAge)
      System.out.println("El usuario es mayor de edad");
    else
      throw  new IllegalArgumentException("El usuario es menor de edad");
  }

}
