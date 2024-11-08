package com.demo.poc.collections.lists;

import java.util.ArrayList;
import java.util.List;

/**
 * Las listas son estructuras de datos que permiten almacenar múltiples elementos.
 *
 * Características:
 * - Pueden cambiar su tamaño según sea añadan o eliminen elementos.
 * - Solo puede almacenar objetos.
 * - Proporciona métodos útiles como add(), remove(), get(), size(), etc.
 * - List es una interface de Java y la implementación más común es ArrayList
 */
public class IntroLists {

  public static void main(String[] args) {
    List<String> nameList = new ArrayList<>();
    nameList.add("Mark Zuckerberg");
    nameList.add("Elon Musk");
    nameList.add("Freddy Vega");
    nameList.add("Linus Torvalds");

    System.out.println("\n########## Segundo elemento (índice 1) #############");
    String secondName = nameList.get(1);
    System.out.println(secondName);

    System.out.println("\n########## Recorrido de todos sus elementos #############");
    for(String name: nameList) {
      System.out.println(name);
    }

    System.out.println("\n########## Añadir un elemento #############");
    nameList.add("Yoau");
    for(String name: nameList) {
      System.out.println(name);
    }

    System.out.println("\n########## Remover primer elemento #############");
    nameList.remove(0);
    for(String name: nameList) {
      System.out.println(name);
    }

  }
}