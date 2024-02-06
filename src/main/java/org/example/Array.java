package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = sc.nextInt();
        }
        int maxNegative = -10;
        int maxNegativeIndex = 0;
        int minPositive = 10;
        int minPositiveIndex = 0;
        for (int i = 0; i < 20; i++) {
            if (array[i] > maxNegative && array[i]  < 0) {
                maxNegative = array[i];
                maxNegativeIndex = i;
            } else if (array[i]  < minPositive && array[i]  > 0) {
                minPositive = array[i];
                minPositiveIndex = i;
            }
        }
        System.out.println("Максимальное отрицательное число в массиве: " + maxNegative);
        System.out.println("Минимальное положительное число в массиве: " + minPositive);
        array[maxNegativeIndex] = minPositive;
        array[minPositiveIndex] = maxNegative;
        System.out.println(Arrays.toString(array));
    }
}
