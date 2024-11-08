package com.demo.poc.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Caso de uso:  Gestión de clientes
 *
 * Reglas de negocio:
 * - La aplicación debe permitir agregar, listar y eliminar clientes.
 * - Los nombres de los clientes deben ser únicos.
 * - El nombre del cliente debe tener al menos 3 caracteres.
 *
 * Criterios de aceptación:
 * - La aplicación debe permitir ingresar el nombre del cliente.
 * - La aplicación debe mostrar la lista de clientes.
 * - La aplicación debe permitir eliminar un cliente por nombre.
 */
public class CustomerService {

  public static final String[] CUSTOMERS = {"Fabian", "Omar", "Jhunior", "Martin", "Lorena"};

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //se crea una lista y se inicializa con los elementos del arreglo
    List<String> customerList = new ArrayList<>(Arrays.asList(CUSTOMERS));

    System.out.print("Ingrese el nombre del nuevo cliente: ");
    String name = scanner.next();
    customerList.add(name);

    System.out.println("############# Lista de clientes #############");
    for(String currentName: customerList) {
      System.out.println(currentName);
    }

    System.out.print("Ingrese el nombre del cliente que dessea eliminar: ");
    String nameToRemove = scanner.next();
    customerList.remove(nameToRemove);

    System.out.println("############# Lista de clientes #############");
    for(String element: customerList) {
      System.out.println(element);
    }
  }
}
