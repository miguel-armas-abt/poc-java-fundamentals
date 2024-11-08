package com.demo.poc.collections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Caso de uso: Tipo de cambio
 * 
 * Reglas de negocio:
 * - El tipo de cambio mide el valor de una moneda en relación a otra.
 * - El monto a convertir debe ser un valor positivo.
 * - Las monedas hábilitadas para el tipo de cambio son soles y dólares.
 * - La tasa de tipo de cambio es 3.78
 *
 * Criterios de aceptación: 
 * - La aplicación debe permitir ingresar la moneda de origen.
 * - La aplicación debe permitir ingresar la moneda de destino.
 * - La aplicación debe permitir ingresar el monto que se desea procesar.
 * - La aplicación debe realizar la conversión de la moneda.
 */
public class MoneyExchangeService {

  private static final String PEN = "PEN";
  private static final String USD = "USD";

  public static void main(String[] args) {
    Map<String, String> symbolCurrenciesMap = new HashMap<>();
    symbolCurrenciesMap.put(PEN, "S/");
    symbolCurrenciesMap.put(USD, "$");

    Scanner scanner = new Scanner(System.in);

    //inputs & validations
    double exchangeRate = 3.78;

    System.out.print("Ingrese la moneda de origen y destino. Ej. PEN,USD: ");
    String currenciesInput = scanner.next();

    String[] currencies = currenciesInput.split(",");
    String originCurrency = currencies[0];
    String destinationCurrency = currencies[1];

    if(!symbolCurrenciesMap.containsKey(originCurrency))
      throw new IllegalArgumentException("La moneda de origen es inválida.");

    if(!symbolCurrenciesMap.containsKey(destinationCurrency))
      throw new IllegalArgumentException("La moneda de destino es inválida.");

    System.out.print("Por favor, ingrese el monto que desea convertir: ");
    double amount = scanner.nextDouble();

    if(amount <= 0)
      throw new IllegalArgumentException("El monto a transferir es inválido.");

    //process
    if(PEN.equals(currenciesInput) && USD.equals(destinationCurrency))
      amount = amount / exchangeRate;

    if(USD.equals(currenciesInput) && PEN.equals(destinationCurrency))
      amount = amount * exchangeRate;

    //output
    System.out.println("El monto convertido es: " + symbolCurrenciesMap.get(destinationCurrency) + amount);
  }
}
