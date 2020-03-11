package com.example.kube.demo.exception;

public class PersonException extends NullPointerException {

    public static final long serialVersionUID = -3060173274915832438L;

    public PersonException(String msg) {
        super(msg);
    }

    public PersonException() {
        super();
    }

}
