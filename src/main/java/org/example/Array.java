package org.example;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = rnd(-10, 10);
        }
        System.out.println("Изначальный массив:");
        System.out.println(Arrays.toString(array));
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
        System.out.println("Итоговый массив:");
        System.out.println(Arrays.toString(array));
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
