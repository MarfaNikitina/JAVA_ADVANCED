package org.example.newCalculator;

import java.io.IOException;
import java.util.Scanner;

public class userCommunication {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите первое число: ");
            double firstNumber = sc.nextDouble();
            System.out.println("Введите второе число: ");
            double secondNumber = sc.nextDouble();
            System.out.println("Введите код оператора - 1(+),2(-),3(*),4(/)): ");
            int operator = sc.nextInt();
            Calculator calculator = new Calculator<Double>();
            calculator.setX(firstNumber);
            calculator.setY(secondNumber);
            calculator.setOperator(operator);
            double result = calculator.getResult();
            System.out.printf("%.4f", result);
        } catch (Exception e) {
            System.out.println("Вы ввели неверные данные, внимательно прочитайте условия и начните заново");
        }
        sc.close();
        System.exit(0);
    }
}
