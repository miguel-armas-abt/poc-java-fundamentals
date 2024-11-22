package com.demo.poc.exceptions.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderV2 {

  public static void main(String[] args) {
    readFile("data.txt");
  }

  /**
   * Este método utiliza "try" para envolver el código que puede producir una "checked exception",
   * y usa "catch" para controlarla y transformarla en una "unchecked exception".
   */
  private static void readFile(String fileName) {
    try {

      File file = new File(fileName);
      FileReader fileReader = new FileReader(file);

    } catch (FileNotFoundException exception) {
      throw new RuntimeException("File " + fileName + " not found", exception);
    }
  }
  
}
