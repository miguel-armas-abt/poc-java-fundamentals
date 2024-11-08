package com.demo.poc.strings;

import java.util.Scanner;

/**
 * Caso de uso: Ofuscar las tarjetas
 * 
 * Reglas de negocio: 
 * - Para evitar la divulgación innecesaria de información confidencial del usuario, algunos datos deben ser mostrados parcialmente.
 * - El BIN (Bank Identification Number) es el conjunto de los seis primeros dígitos de una tarjeta.
 * - Tanto el BIN como los últimos cuatro dígitos de la tarjeta deben mostrarse, mientras que la parte central debe ser ofuscada.
 * 
 * Criterios de aceptación:  La aplicación debe ofuscar la tarjeta ingresada.
 * 
 * Ejemplos: 
 * - Si la tarjeta tiene 16 dígitos: 4222241111113004 --> 422224******3004
 * - Si la tarjeta tiene 15 dígitos: 377753111113380 --> 377753*****3380
 */
public class CardObfuscatorService {

  private final static String SIX_CHARS_MASK = "******";
  private final static String FIVE_CHARS_MASK = "*****";
  private final static int DEFAULT_CARD_LENGTH = 16;
  private final static int THIRD_SEGMENT_LENGTH = 4;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //inputs & validations
    System.out.print("Por favor, ingrese su número de tarjeta: ");
    String cardNumber = scanner.next();

    //process
    String mask = (DEFAULT_CARD_LENGTH == cardNumber.length())
        ? SIX_CHARS_MASK
        : FIVE_CHARS_MASK;

    int secondAndThirdSegmentLength = mask.length() + THIRD_SEGMENT_LENGTH;
    int totalLength = cardNumber.length();

    String lastDigits = cardNumber.substring(totalLength - THIRD_SEGMENT_LENGTH);
    String initialDigits = cardNumber.substring(0, totalLength - secondAndThirdSegmentLength);
    cardNumber = initialDigits + mask + lastDigits;

    //output
    System.out.println("Tarjeta ofuscada: " + cardNumber);
  }
}
