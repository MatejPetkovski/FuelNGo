package com.fuelngo.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PasswordsNotMatchingException extends RuntimeException{

    public PasswordsNotMatchingException() {
        super("Лозинките не се совпаѓаат, обидете се повторно.");
    }
}
