package com.demo.poc.datastructures.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Caso de uso:  Chequeo de puntos de lealtad
 *
 * Reglas de negocio: 
 * - Los clientes acumulan puntos de lealtad por cada transacción realizada con su tarjeta de crédito.
 * - Los puntos de lealtad pueden ser canjeados por productos o servicios.
 * - Cada cliente tiene un DNI.
 * - El cliente puede verificar la cantidad de puntos acumulados ingresando su DNI.
 *
 * Criterios de aceptación:  La aplicación debe permitir verificar los puntos de lealtad de un cliente.
 */
public class PointCheckerService {

  public static void main(String[] args) {
    Map<String, Integer> userPointsMap = new HashMap<>();
    userPointsMap.put("76543210", 1200);
    userPointsMap.put("76543211", 850);
    userPointsMap.put("76543212", 400);

    Scanner scanner = new Scanner(System.in);

    // inputs & validations
    System.out.print("Ingrese su DNI: ");
    String dni = scanner.next();

    if (!userPointsMap.containsKey(dni)) {
      throw new IllegalArgumentException("DNI no encontrado.");
    } else {
      // process
      int loyaltyPoints = userPointsMap.get(dni);

      // output
      System.out.println("Cliente " + dni + " tiene " + loyaltyPoints + " puntos de lealtad.");
    }
  }
}
