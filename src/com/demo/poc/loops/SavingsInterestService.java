package com.demo.poc.loops;

import java.util.Scanner;

/**
 * Caso de uso: Cálculo de intereses en cuenta de ahorro
 *
 * Reglas de negocio:
 * - Una cuenta de ahorros es un tipo de cuenta que genera intereses sobre el saldo.
 * - La tasa de interés anual varía en función del saldo de la cuenta:
 *   - Menos de 1000: 1% anual
 *   - Entre 1000 y 5000: 2% anual
 *   - Más de 5000: 3% anual
 * - Fórmula de interés anual: (interés anual) = (saldo) * (tasa de interés anual)
 * 
 * Criterios de aceptación:
 *  - La aplicación debe permitir ingresar el saldo de la cuenta de ahorros.
 *  - La aplicación debe permitir ingresar el número de años que se desea calcular.
 *  - La aplicación debe calcular el interés anual por cada año.
 */
public class SavingsInterestService {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //inputs & validations
    System.out.print("Ingrese el saldo inicial de la cuenta: ");
    double balance = scanner.nextDouble();

    if (balance <= 0)
      throw new IllegalArgumentException("El saldo debe ser positivo.");

    double annualInterestRate = 0.0;

    if (balance < 1000)
      annualInterestRate = 0.01;

    if (balance >= 1000 && balance <= 5000)
      annualInterestRate = 0.02;

    if (balance > 5000)
      annualInterestRate = 0.03;

    System.out.print("Ingrese el número de años: ");
    int years = scanner.nextInt();

    if (years <= 0) {
      throw new IllegalArgumentException("El número de años debe ser positivo.");
    }

    //process
    for (int i = 1; i <= years; i++) {
      double interest = balance * annualInterestRate;
      balance += interest;

      //%d: formato de número entero
      //%.2f: formato de número con dos decimales
      System.out.printf("Saldo al final del año %d: %.2f (Intereses: %.2f)\n", i, balance, interest);
    }
  }
}
