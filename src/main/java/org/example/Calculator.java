package org.example;

/**
 * @author Nikitina Marfa IBS
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double x = sc.nextDouble();
        System.out.println("Введите второе число: ");
        double y = sc.nextDouble();
        System.out.println("Введите оператор: ");
        String operator = sc.next();
        switch (operator) {
            case ("+"):
                getSum(x, y);
                break;
            case ("-"):
                getSubtraction(x, y);
                break;
            case ("*"):
                getMultiply(x, y);
                break;
            case ("/"):
                getDivision(x, y);
                break;
            default:
                System.out.println("Ошибка оператора");
        }
        sc.close();
    }

    public static void getSum(double x, double y) {
        double sum = x + y;
        System.out.printf("%.4f", sum);
    }

    public static void getSubtraction(double x, double y) {
        double sub = x - y;
        System.out.printf("%.4f", sub);
    }
    public static void getMultiply(double x, double y) {
        double result = x * y;
        System.out.printf("%.4f", result);
    }
    public static void getDivision(double x, double y) {
        double result = x / y;
        System.out.printf("%.4f", result);
    }
}
