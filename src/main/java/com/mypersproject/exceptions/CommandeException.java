package com.mypersproject.exceptions;


public  class CommandeException extends RuntimeException{
    private String message;
 
    public CommandeException() {}
 
    public CommandeException(String msg)
    {
        super(msg);
        this.message = msg;
    }
}
