package me.jysh.springyelpcamp.exception;

import org.springframework.http.HttpStatus;

public interface EnrichedException {

  String getErrorMessage();

  HttpStatus getHttpStatus();
}
