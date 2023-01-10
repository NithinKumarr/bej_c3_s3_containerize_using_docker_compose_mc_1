package com.example.music.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.CONFLICT,reason="Customer already exsit")
public class CustomerAlreadyExistException extends Exception{
}
