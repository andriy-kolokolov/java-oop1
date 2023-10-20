package org.lessons.java.bank;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message) {
        super(message);
    }
}
