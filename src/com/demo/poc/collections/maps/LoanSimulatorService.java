package com.demo.poc.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Caso de uso: Simulador de préstamo
 * 
 * Reglas de negocio:
 * - Un cliente puede simular un préstamo indicando el monto, plazo y tipo de cliente (nuevo o recurrente).
 * - La tasa de interés varía según el tipo de cliente:
 *   - Nuevo cliente: 5% anual
 *   - Cliente recurrente: 3% anual
 * - El monto del préstamoo debe ser positivo.
 * - El plazo debe ser entre 1 y 10 años.
 * - Pago total = monto × (1 + tasa de interés)^años
 * 
 * Criterios de aceptación: La aplicación debe calcular y mostrar el total a pagar al final del plazo.
 */
public class LoanSimulatorService {

  public static void main(String[] args) {
    Map<String, Double> interestRates = new HashMap<>();
    interestRates.put("N", 0.05);
    interestRates.put("R", 0.03);

    Scanner scanner = new Scanner(System.in);

    //inputs & validations
    System.out.print("Ingrese el monto del préstamoo: ");
    double loanAmount = scanner.nextDouble();

    if (loanAmount <= 0) {
      throw new IllegalArgumentException("El monto del préstamoo debe ser positivo.");
    }

    System.out.print("Ingrese el plazo del préstamoo en años: ");
    int years = scanner.nextInt();

    if (years < 1 || years > 10) {
      throw new IllegalArgumentException("El plazo debe ser entre 1 y 10 años.");
    }

    System.out.print("Ingrese el tipo de cliente (nuevo: N, recurrente: R): ");
    String customerType = scanner.next();

    if (!interestRates.containsKey(customerType)) {
      throw new IllegalArgumentException("Tipo de cliente inválido.");
    }

    double interestRate = interestRates.get(customerType);

    //process
    double totalToPay = loanAmount * Math.pow(1 + interestRate, years);

    //output
    //%.2f: formato de número con dos decimales
    System.out.printf("Total a pagar al final del plazo: %.2f\n", totalToPay);
  }
}
