package com.demo.poc.ifelse;

import java.util.Scanner;

/**
 * Caso de uso: Selección de Clientes VIP
 *
 * Reglas de negocio: 
 * - Un cliente se considera VIP si tiene más de cierto monto en su cuenta.
 * - La categoría VIP puede ser "Plata", "Oro" o "Platino" dependiendo del monto:
 *   - Plata: más de 10,000 y hasta 50,000
 *   - Oro: más de 50,000 y hasta 100,000
 *   - Platino: más de 100,000
 * 
 * Criterios de aceptación:  La aplicación debe determinar y mostrar la categoría VIP del cliente.
 */
public class VIPCustomerService {

  private static final String PLATINUM = "Platino";
  private static final String GOLD = "Oro";
  private static final String SILVER = "Plata";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // inputs & validations
    System.out.print("Ingrese el saldo de la cuenta del cliente: ");
    double accountBalance = scanner.nextDouble();

    if (accountBalance < 0)
      throw new IllegalArgumentException("El saldo debe ser positivo.");

    // process
    String vipCategory = "";

    if (accountBalance > 100000) {
      vipCategory = PLATINUM;
    }

    if (accountBalance > 50000 && accountBalance <= 100000) {
      vipCategory = GOLD;
    }

    if (accountBalance > 10000 && accountBalance <= 50000) {
      vipCategory = SILVER;
    }

    if (accountBalance <= 10000) {
      throw new IllegalArgumentException("El cliente no tiene una categoría VIP");
    }

    // output
    System.out.println("La categoría VIP del cliente es: " + vipCategory);
  }
}
