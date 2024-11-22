package com.demo.poc.exceptions.custom;

public class BusinessException extends RuntimeException {

  private String code;

  public BusinessException(String code) {
    super(code);
    this.code = code;
  }

  public BusinessException(String code, String message) {
    super(message);
    this.code = code;
  }

  public String getCode() {
    return code;
  }

}
