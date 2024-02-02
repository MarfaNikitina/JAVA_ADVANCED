package org.example;

/**
 * @author Nikitina Marfa IBS
 * @see
 */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер задачи (1 - калькулятор," +
                " 2 - поиск максимального элемента в массиве):  ");
        int choice = sc.nextInt();
        switch (choice) {
            case (1):
                getCalculations();
                break;
            case (2):
                findMaxByLength();
                break;
            default:
                System.out.println("Ошибка выбора");
        }
    }

    public static void findMaxByLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину масива: ");
        int arrayLen = sc.nextInt();
        String [] array = new String[arrayLen];
        System.out.println("Введите элементы масива: ");
        for (int i = 0; i < arrayLen; i++) {
            String element = sc.next();
            array[i] = element;
        }
        String maxWord = array[0];
        for (String element: array) {
            if (element.length() > maxWord.length()) {
                maxWord = element;
            }
        }
        System.out.println("Самый длинный элемент массива: " + maxWord);
    }
    public static void getCalculations() {
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
