package com.demo.poc.datastructures.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Caso de uso: Consultar el historial de transacciones
 *
 * Reglas de negocio:
 * - Los clientes pueden consultar su historial de transacciones.
 * - Cada transacción incluye el tipo (depósito, retiro), el monto y la fecha.
 *
 * Criterios de aceptación: La aplicación debe permitir mostrar el historial de transacciones.
 */
public class TransactionHistoryService {

  public static void main(String[] args) {
    List<String> transactions = new ArrayList<>();
    transactions.add("Depósito, 1000.00, 01/07/2024");
    transactions.add("Retiro, 200.00, 05/07/2024");
    transactions.add("Depósito, 500.00, 10/07/2024");

    for (String transaction : transactions) {
      String[] parts = transaction.split(",");
      System.out.println("Tipo: " + parts[0].trim());
      System.out.println("Monto: " + parts[1].trim());
      System.out.println("Fecha: " + parts[2].trim());

      System.out.println("----------------------------------------");
    }
  }

}
