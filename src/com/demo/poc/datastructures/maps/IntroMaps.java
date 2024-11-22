package com.demo.poc.datastructures.maps;

import java.util.HashMap;
import java.util.Map;

/**
 * Los mapas son estructuras de datos que permiten almacenar múltiples elementos de tipo clave-valor.
 *
 * Características:
 * - Cada clave del mapa es único.
 */
public class IntroMaps {

  public static void main(String[] args) {
    Map<String, String> userMap = new HashMap<>();
    userMap.put("76543210", "Elon Musk");
    userMap.put("76543211", "Mark Zuckerberg");

    System.out.println("\n########## Obtener un elemento por su clave #############");
    String name = userMap.get("76543210");
    System.out.println(name);

    System.out.println("\n########## Validar si existe una clave en el mapa #############");
    boolean containsUser = userMap.containsKey("76543211");
    System.out.println(containsUser);

  }
}
