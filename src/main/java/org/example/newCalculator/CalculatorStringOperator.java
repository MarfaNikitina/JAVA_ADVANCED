package org.example.newCalculator;

public class CalculatorStringOperator {
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

    public void setOperator(String operator) throws NoSuchOperatorException {
        if (operator.equals("+")||operator.equals("-")||operator.equals("/")||operator.equals("*")) {
            this.operator = operator;
        } else {
            throw new NoSuchOperatorException(operator);
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

    public double getResult() throws ZeroDivisionException {
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
                if (this.y == 0) {
                    throw new ZeroDivisionException();
                } else {
                    result = getDivision(this.x, this.y);
                }
                break;
        }
        return result;
    }

}
