package com.demo.poc.exceptions.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderV1 {

  /**
   * Se prolifera el throws, generando dependencia.
   */
  public static void main(String[] args) throws FileNotFoundException {
    readFile("data.txt");
  }

  /**
   * Este método utiliza "throws" para declarar que no manejará la "checked exception",
   * delegando la responsabilidad al método que lo invoque.
   */
  private static void readFile(String fileName) throws FileNotFoundException {
    File file = new File(fileName);
    FileReader fileReader = new FileReader(file);
  }
}