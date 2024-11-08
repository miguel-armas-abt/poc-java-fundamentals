package com.demo.poc.strings;

/**
 * Una cadena de texto es una secuencia de caracteres.
 * Las cadenas son objetos del tipo String y proporcionan múltiples métodos para manipular y tratar texto.
 */
public class IntroStrings {

  public static void main(String[] args) {
    String name = "  Mark Zuckerberg  ";
    String modified = "";

    modified = name.trim(); //elimina espacios al inicio y al final
    modified = name.toLowerCase(); //convierte a minúsculas
    modified = name.toUpperCase(); //convierte a mayúsculas
    modified = name.concat("."); //concatena, similar al operador +
    modified = name.repeat(2); //repite la cadena
    modified = name.replace("k", "*"); //reemplaza con * todas las ocurrencias de 'k'

    char modifiedChar = name.charAt(2); //recupera el caracter del índice=2
    boolean containsSubstring = name.contains("Mark"); //evalúa si la cadena contiene la porción de texto
    int indexOfOccurrence = name.indexOf("Zuckerberg"); //recupera el índice en que hay una coincidencia

    System.out.println("name: " + name);
    System.out.println("modified: " + modified);
    System.out.println("modifiedChar: " + modifiedChar);
    System.out.println("containsSubstring: " + containsSubstring);
    System.out.println("indexOfOccurrence: " + indexOfOccurrence);
  }
}
