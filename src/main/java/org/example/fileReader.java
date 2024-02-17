package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class fileReader <file> {
    public static void main(String[] args)  throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/main/resources/file.txt"));
        List<String> list = new ArrayList<>();
        while (sc.hasNext()) {
            list.add(sc.next());
        }
        System.out.println("Исходный масссив:");
        System.out.println(list.toString());
        System.out.println("Отсортированный масссив:");
        Collections.sort(list);
        System.out.println(list.toString());
        Map<String, Integer> counter = new HashMap<>();
        for (String word : list) {
            int newValue = counter.getOrDefault(word, 0) + 1;
            counter.put(word, newValue);
        }
        System.out.println("Counter:");
        System.out.println(counter);
        int maxValue = 0;
        List<String> maxLengthWord = new ArrayList<>();
        for (Map.Entry<String, Integer> pair: counter.entrySet())
        {
            if (pair.getValue() == maxValue) {
                maxValue = pair.getValue();
                maxLengthWord.add(pair.getKey());
            } else if (pair.getValue() > maxValue){
                maxValue = pair.getValue();
                maxLengthWord.clear();
                maxLengthWord.add(pair.getKey());
            }
        }
        System.out.println("Максимальное количество вхождений: " + maxValue);
        System.out.println("Слова, повторяющиеся максимально количество раз: ");
        for (String item: maxLengthWord
             ) {
            System.out.println(item);
        }
    }
}
