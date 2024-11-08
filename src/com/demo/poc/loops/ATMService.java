package com.demo.poc.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Caso de uso: Cajero automático
 *
 * Reglas de negocio: 
 * - Un cliente puede realizar múltiples depósitos en su cuenta a través de un cajero automático (ATM).
 * - El monto de cada depósito debe ser positivo.
 * - La aplicación debe permitir ingresar el monto de cada depósito y calcular el saldo final de la cuenta.
 * - Después de cada depósito, el usuario puede optar por realizar otro depósito o finalizar la transacción.
 * 
 * Criterios de aceptación: La aplicación debe registrar cada depósito y mostrar el saldo final de la cuenta.
 */
public class ATMService {

  private static final String YES = "si";
  private static final String SEPARATOR = "----------------------------------------";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<Double> deposits = new ArrayList<>();
    double totalBalance = 0;

    while (true) {
      //input & validation
      System.out.print("Ingrese el monto del depósito: ");
      double deposit = scanner.nextDouble();

      if (deposit <= 0) {
        System.out.println("El monto del depósito debe ser positivo.");
        continue; //interrumpir y continuar con la siguiente iteración
      }

      deposits.add(deposit);
      totalBalance += deposit;

      //%.2f: formato de número con dos decimales
      System.out.printf("Depósito de %.2f registrado. Saldo total: %.2f\n", deposit, totalBalance);

      System.out.print("¿Desea realizar otro depósito? (SI/NO): ");
      String response = scanner.next().trim().toLowerCase();

      if (!YES.equals(response)) {
        break; //salir del bucle
      }

      System.out.println(SEPARATOR);
    }

    System.out.println(SEPARATOR);

    // output
    System.out.println("Transacción finalizada.");
    System.out.printf("Depósitos realizados: %s\n", deposits);

    //%.2f: formato de número con dos decimales
    System.out.printf("Saldo total: %.2f\n", totalBalance);
  }
}