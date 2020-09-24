package com.epam.task1.exceptions;

public class BuckwheatInclusionException extends RuntimeException{

    public BuckwheatInclusionException(String message) {
        super("Buckwheat has inclusion" + message);
    }
}
