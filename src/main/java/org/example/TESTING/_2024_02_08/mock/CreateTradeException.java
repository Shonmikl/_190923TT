package org.example.TESTING._2024_02_08.mock;

public class CreateTradeException extends RuntimeException {
    public CreateTradeException() {
        super("Cannot create such trade!");
    }
}