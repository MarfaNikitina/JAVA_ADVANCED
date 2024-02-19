package org.example.newCalculator;

public class NoSuchOperatorException extends Exception {
    private String operator;

    public NoSuchOperatorException(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }
}
