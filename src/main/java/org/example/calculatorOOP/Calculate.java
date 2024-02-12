package org.example.calculatorOOP;

import org.example.calculatorOOP.arithmeticOperations.*;

public class Calculate {

    public static void calculate(double x, double y, String operator) {
        Action action;
        double result = 0;
        if (operator.equals("-")) {
            action = new Substraction();
            result = action.action(x, y);
        } else if (operator.equals("*")) {
            action = new Multiply();
            result = action.action(x, y);
        } else if (operator.equals("/")) {
            action = new Division();
            result = action.action(x, y);
        } else if (operator.equals("+")) {
            action = new Addition();
            result = action.action(x, y);
        }
        if (result == 0) {
            System.out.println("Ошибка оператора, попробуйте еще раз");
        } else {
            System.out.printf("%.4f", result);
        }
    }
}
