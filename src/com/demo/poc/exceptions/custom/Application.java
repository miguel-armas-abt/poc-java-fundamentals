package com.demo.poc.exceptions.custom;

public class Application {

  public static void main(String[] args) {
    String cellphoneNumber = "+51987654321";

    if(!cellphoneNumber.matches("^9\\d{8}$"))
      throw new BusinessException("InvalidFormatPhone", "Invalid format phone");
  }
}
