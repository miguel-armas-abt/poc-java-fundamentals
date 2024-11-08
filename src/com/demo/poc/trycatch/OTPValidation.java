package com.demo.poc.trycatch;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Caso de uso: Verificación de identidad mediante OTP
 * 
 * Reglas de negocio: 
 * - El cliente solicita realizar una operación sensible (cambio de contraseña, transferencias, etc).
 * - El sistema envía un OTP al número de teléfono registrado del cliente.
 * - El cliente debe ingresar el OTP para verificar su identidad.
 * 
 * Criterios de aceptación: La aplicación debe verificar correctamente el OTP antes de proceder con la operación.
 */
public class OTPValidation {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    SecureRandom random = new SecureRandom();
    int otp = random.nextInt(900000) + 100000;

    System.out.println("Se envió un código OTP a su número telefónico");

    try {
      Thread.sleep(3000); // Simula un retraso de 3 segundos
      System.out.println(otp);
    } catch (InterruptedException e) {
      throw new IllegalArgumentException("Lo sentimos, ocurrió un error al enviar el código OTP.");
    }

    System.out.print("Ingrese el OTP recibido: ");
    int enteredOtp = scanner.nextInt();

    if (otp == enteredOtp) {
      System.out.println("Verificación exitosa.");
    } else {
      throw new IllegalArgumentException("OTP incorrecto. Verificación fallida.");
    }
  }
}
