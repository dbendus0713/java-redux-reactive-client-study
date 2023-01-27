package myspringboot.r2dbc.customerclient.exception;

import org.springframework.http.HttpStatus;

public class CustomAPIException extends RuntimeException{
  private HttpStatus httpStatus;

  public CustomAPIException(String message) {
    //417
    this(message, HttpStatus.EXPECTATION_FAILED);
  }

  public CustomAPIException(String message, HttpStatus httpStatus) {
    super(message);
    this.httpStatus = httpStatus;
  }

  public HttpStatus getHttpStatus() {

    return httpStatus;
  }
}