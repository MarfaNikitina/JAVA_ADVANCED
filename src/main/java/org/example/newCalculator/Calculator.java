package org.example.newCalculator;

public class Calculator {
    private double x;
    private double y;
    private String operator;
    private double result;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setOperator(String operator) {
        if (validateOperator(operator)) {
            this.operator = operator;
        } else {
            System.out.println("Ошибка оператора");
        }
    }

    public static double getSum(double x, double y) {
        double sum;
        sum = x + y;
        return sum;
    }

    public static double getSubtraction(double x, double y) {
        double sub;
        sub = x - y;
        return sub;
    }
    public static double getMultiply(double x, double y) {
        double result;
        result = x * y;
        return result;
    }
    public static double getDivision(double x, double y) {
        double result;
        result = x / y;
        return result;
    }
    private static boolean validateOperator(String operator) {
        boolean result;
        result = operator.equals("+")||operator.equals("-")||operator.equals("/")||operator.equals("*");
        return result;
    }

    public double getResult() {
        switch (this.operator) {
            case "+":
                result = getSum(this.x, this.y);
                break;
            case "-":
                result = getSubtraction(this.x, this.y);
                break;
            case "*":
                result = getMultiply(this.x, this.y);
                break;
            case "/":
                result = getDivision(this.x, this.y);
                break;
        }
        return result;
    }

}
