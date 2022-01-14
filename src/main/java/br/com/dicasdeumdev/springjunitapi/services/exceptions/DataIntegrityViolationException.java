package br.com.dicasdeumdev.springjunitapi.services.exceptions;

public class DataIntegrityViolationException extends  RuntimeException{
    public DataIntegrityViolationException(String message) {
        super(message);
    }
}
