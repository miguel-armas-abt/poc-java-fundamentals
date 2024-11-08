package com.demo.poc.regex;

import java.util.*;

/**
 * Caso de uso: Validación de tarjetas
 *
 * Reglas de negocio: 
 * - El número de tarjeta debe tener una longitud de 15 o 16 dígitos.
 * - La tarjeta debe tener una fecha de vencimiento válida en el formato MM/YY. Ej. 13/25
 * - El BIN (Bank Identification Number) es el conjunto de los seis primeros dígitos de una tarjeta, los cuales permiten identificar:
 *    - Banco y país de emisión de la tarjeta
 *    - Tipo de tarjeta (crédito, débito, etc)
 *    - Red de pago (Visa, Mastercard, etc)
 * 
 * Criterios de aceptación: La aplicación debe validar la tarjeta ingresada.
 * 
 * Ejemplos:
 * - Tarjeta válida: 4506771111114444 --> Cumple con alguno de los BINES y tiene 16 dígitos.
 * - Tarjeta inválida: 4567891111114444 --> No coincide con ningún BIN.
 * - Tarjeta inválida: 51100211111144444 --> Tiene más de 16 dígitos.
 */
public class CardValidatorService {

  private static final String EXPIRATION_DATE_REGEX = "(0[1-9]|1[0-2])/([0-9]{2})";
  private static final String[] BIN_ARRAY = {"450677", "457396", "457397", "464049", "511002", "511003", "511005"};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //inputs & validations
    System.out.print("Ingrese el número de la tarjeta (15 o 16 dígitos): ");
    String cardNumber = scanner.next();

    if (cardNumber.length() < 15 || cardNumber.length() > 16)
      throw new IllegalArgumentException("El número de la tarjeta debe tener 15 o 16 dígitos.");

    List<String> binList = Arrays.asList(BIN_ARRAY);
    String bin = cardNumber.substring(0, 6);
    if(!binList.contains(bin))
      throw new IllegalArgumentException("BIN inválido.");

    System.out.print("Ingrese la fecha de vencimiento (MM/AA): ");
    String expirationDate = scanner.next();
    if (!expirationDate.matches(EXPIRATION_DATE_REGEX))
      throw new IllegalArgumentException("Fecha de vencimiento inválida. Formato esperado: MM/AA.");

    System.out.println("La tarjeta " + cardNumber + " es válida");
  }
}