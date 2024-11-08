/**
 * Un paquete en el proyecto representa una carpeta en el sistema de archivos y permite organizar las clases en diferentes módulos.
 * En este caso "com.demo.poc.intro" es el paquete donde se encuentra la clase Application.
 */
package com.demo.poc;

/**
 * - Application es una clase de Java. Una clase es una plantilla que define el comportamiento del programa.
 * - El nombre de la clase debe corresponder con el nombre del archivo.
 * - Los bloques que agrupan código deben iniciar y terminar con llave '{}'
 * - Cada línea de código que realiza una acción se llama instrucción. Cada instrucción debe terminar con punto y coma ';'
 */
public class Application {

  /**
   * - El método main es el punto de arranque de nuestra aplicación.
   */
  //shortcut: psvm
  public static void main(String[] args) {

    //shortcut: sout
    System.out.println("Hello world!");
  }
}
