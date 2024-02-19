package org.example.newCalculator;

import java.io.IOException;
import java.util.Scanner;

public class Communication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            double firstNumber = sc.nextDouble();
            System.out.println("Введите второе число: ");
            double secondNumber = sc.nextDouble();
            System.out.println("Введите оператор (+,-,*,/): ");
            String operator = sc.next();
            CalculatorStringOperator calculator = new CalculatorStringOperator();
            calculator.setX(firstNumber);
            calculator.setY(secondNumber);
            calculator.setOperator(operator);
            double result = calculator.getResult();
            System.out.printf("%.4f", result);
        }  catch (NoSuchOperatorException e) {
            System.out.println("Вы ввели несуществующий оператор: " + e.getOperator());
            e.printStackTrace();
        }  catch (ZeroDivisionException e2) {
            System.out.println("Делить на ноль нельзя");
            e2.printStackTrace();
        } catch (Exception e1) {
            System.out.println("Вы ввели неверные данные, внимательно прочитайте условия и начните заново");
            e1.printStackTrace();
        }
        sc.close();
        System.exit(0);
    }
}

