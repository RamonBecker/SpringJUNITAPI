package br.com.dicasdeumdev.springjunitapi.services.exceptions;

public class ObjectNotFoundException extends  RuntimeException{
    public ObjectNotFoundException(String message) {
        super(message);
    }
}
